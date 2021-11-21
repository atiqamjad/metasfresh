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
/**
 * PatientNote
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-05T09:14:03.653Z[GMT]")
public class PatientNote {
  @SerializedName("status")
  private BigDecimal status = null;

  @SerializedName("noteText")
  private String noteText = null;

  @SerializedName("patientId")
  private String patientId = null;

  @SerializedName("archived")
  private Boolean archived = null;

  public PatientNote status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * Art der PatientNote (1 &#x3D; Notiz, 2 &#x3D; Information, 3 &#x3D; Warnung)
   * @return status
  **/
  @Schema(example = "1", description = "Art der PatientNote (1 = Notiz, 2 = Information, 3 = Warnung)")
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public PatientNote noteText(String noteText) {
    this.noteText = noteText;
    return this;
  }

   /**
   * Text der Patientennotiz
   * @return noteText
  **/
  @Schema(example = "MRSA positiv", description = "Text der Patientennotiz")
  public String getNoteText() {
    return noteText;
  }

  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }

  public PatientNote patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

   /**
   * Id des Patienten in Alberta
   * @return patientId
  **/
  @Schema(example = "a4adecb6-126a-4fa6-8fac-e80165ac4264", description = "Id des Patienten in Alberta")
  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public PatientNote archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Kennzeichen, ob die Notiz vom Benutzer archiviert wurde
   * @return archived
  **/
  @Schema(example = "false", description = "Kennzeichen, ob die Notiz vom Benutzer archiviert wurde")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientNote patientNote = (PatientNote) o;
    return Objects.equals(this.status, patientNote.status) &&
        Objects.equals(this.noteText, patientNote.noteText) &&
        Objects.equals(this.patientId, patientNote.patientId) &&
        Objects.equals(this.archived, patientNote.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, noteText, patientId, archived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientNote {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
