/*
 * Patient - Warenwirtschaft (Basis)
 * Synchronisation der Patienten mit der Warenwirtschaft
 *
 * OpenAPI spec version: 1.0.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
/**
 * falls dem Arzt direkt eine Institution zugeordnet ist, wird diese hier übertragen
 */
@Schema(description = "falls dem Arzt direkt eine Institution zugeordnet ist, wird diese hier übertragen")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-05T09:14:03.653Z[GMT]")
public class PatientPrimaryDoctorInstitution {
  @SerializedName("type")
  private BigDecimal type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("institutionId")
  private UUID institutionId = null;

  public PatientPrimaryDoctorInstitution type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Art der Institution (2 &#x3D; Pflegeheim/nursingHome, 4 &#x3D; Klinik/hospital, 7 &#x3D; Gemeinschaftspraxis)
   * @return type
  **/
  @Schema(example = "4", description = "Art der Institution (2 = Pflegeheim/nursingHome, 4 = Klinik/hospital, 7 = Gemeinschaftspraxis)")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public PatientPrimaryDoctorInstitution description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Name und Ort der Institution
   * @return description
  **/
  @Schema(example = "Krankenhaus Martha-Maria, 90491 Nürnberg", description = "Name und Ort der Institution")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PatientPrimaryDoctorInstitution institutionId(UUID institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Alberta-Id des Institution (nur bei Pfelgeheim und Klinik)
   * @return institutionId
  **/
  @Schema(example = "a4adecb6-126a-4fa6-8fac-e80165ac4264", description = "Alberta-Id des Institution (nur bei Pfelgeheim und Klinik)")
  public UUID getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(UUID institutionId) {
    this.institutionId = institutionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientPrimaryDoctorInstitution patientPrimaryDoctorInstitution = (PatientPrimaryDoctorInstitution) o;
    return Objects.equals(this.type, patientPrimaryDoctorInstitution.type) &&
        Objects.equals(this.description, patientPrimaryDoctorInstitution.description) &&
        Objects.equals(this.institutionId, patientPrimaryDoctorInstitution.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, institutionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientPrimaryDoctorInstitution {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
