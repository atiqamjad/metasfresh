package de.metas.util.web.security;

import com.google.common.annotations.VisibleForTesting;
import de.metas.i18n.ADLanguageList;
import de.metas.i18n.ILanguageDAO;
import de.metas.security.UserNotAuthorizedException;
import de.metas.util.StringUtils;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.Env;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.util.Optional;

@RequiredArgsConstructor
public class UserAuthTokenFilter implements Filter
{
	public static final String HEADER_Authorization = "Authorization";
	public static final String HEADER_AcceptLanguage = "Accept-Language";
	public static final String QUERY_PARAM_API_KEY = "apiKey";

	private final UserAuthTokenService userAuthTokenService;
	private final UserAuthTokenFilterConfiguration configuration;
	private final ILanguageDAO languageDAO;
	
	@Override
	public void init(final FilterConfig filterConfig) throws ServletException
	{
	}

	@Override
	public void destroy()
	{
	}

	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException
	{
		final HttpServletRequest httpRequest = (HttpServletRequest)request;
		if (isExcludedFromSecurityChecking(httpRequest))
		{
			chain.doFilter(request, response);
		}
		else
		{
			final HttpServletResponse httpResponse = (HttpServletResponse)response;

			try
			{
				userAuthTokenService.run(
						() -> extractTokenString(httpRequest),
						() -> {
							extractAdLanguage(httpRequest).ifPresent(Env::setAD_Language);
							chain.doFilter(httpRequest, httpResponse);
						});
			}
			catch (final UserNotAuthorizedException ex)
			{
				httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, ex.getLocalizedMessage());
			}
		}
	}

	private boolean isExcludedFromSecurityChecking(@NonNull final HttpServletRequest httpRequest)
	{
		return "OPTIONS".equals(httpRequest.getMethod()) // don't check auth for OPTIONS method calls because this causes troubles on chrome preflight checks
				|| configuration.isExcludedFromSecurityChecking(httpRequest);
	}

	private static String extractTokenString(final HttpServletRequest httpRequest)
	{
		//
		// Check Authorization header first
		{
			final String authorizationString = StringUtils.trimBlankToNull(httpRequest.getHeader(HEADER_Authorization));
			if (authorizationString != null)
			{
				if (authorizationString.startsWith("Token "))
				{
					return authorizationString.substring(5).trim();
				}
				else if (authorizationString.startsWith("Basic "))
				{
					final String userAndTokenString = new String(DatatypeConverter.parseBase64Binary(authorizationString.substring(5).trim()));
					final int index = userAndTokenString.indexOf(':');

					return userAndTokenString.substring(index + 1);
				}
				else
				{
					return authorizationString;
				}
			}
		}

		//
		// Check apiKey query parameter
		{
			final String apiKey = StringUtils.trimBlankToNull(httpRequest.getParameter(QUERY_PARAM_API_KEY));
			if (apiKey != null)
			{
				return apiKey;
			}
		}

		throw new AdempiereException("Provide token in `" + HEADER_Authorization + "` HTTP header"
				+ " or `" + QUERY_PARAM_API_KEY + "` query parameter");
	}

	@VisibleForTesting
	Optional<String> extractAdLanguage(@NonNull final HttpServletRequest httpRequest)
	{
		final String acceptLanguageHeader = StringUtils.trimBlankToNull(httpRequest.getHeader(HEADER_AcceptLanguage));
		final ADLanguageList availableLanguages = languageDAO.retrieveAvailableLanguages();
		final String adLanguage = availableLanguages.getAD_LanguageFromHttpAcceptLanguage(acceptLanguageHeader, availableLanguages.getBaseADLanguage());
		return Optional.ofNullable(adLanguage);
	}

}
