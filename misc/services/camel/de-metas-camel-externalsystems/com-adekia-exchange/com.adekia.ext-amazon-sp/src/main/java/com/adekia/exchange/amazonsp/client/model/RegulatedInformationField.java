/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.adekia.exchange.amazonsp.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * A field collected from the regulatory form.
 */
@Schema(description = "A field collected from the regulatory form.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-28T13:53:07.940430682+02:00[Europe/Paris]")
public class RegulatedInformationField {
  @JsonProperty("FieldId")
  private String fieldId = null;

  @JsonProperty("FieldLabel")
  private String fieldLabel = null;

  /**
   * The type of field the field.
   */
  public enum FieldTypeEnum {
    TEXT("Text"),
    FILEATTACHMENT("FileAttachment");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static FieldTypeEnum fromValue(String input) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("FieldType")
  private FieldTypeEnum fieldType = null;

  @JsonProperty("FieldValue")
  private String fieldValue = null;

  public RegulatedInformationField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * The unique identifier for the field.
   * @return fieldId
  **/
  @Schema(required = true, description = "The unique identifier for the field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public RegulatedInformationField fieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
    return this;
  }

   /**
   * The human-readable name for the field.
   * @return fieldLabel
  **/
  @Schema(required = true, description = "The human-readable name for the field.")
  public String getFieldLabel() {
    return fieldLabel;
  }

  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }

  public RegulatedInformationField fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The type of field the field.
   * @return fieldType
  **/
  @Schema(required = true, description = "The type of field the field.")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }

  public RegulatedInformationField fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * The content of the field as collected in regulatory form. Note that FileAttachment type fields will contain an URL to download the attachment here.
   * @return fieldValue
  **/
  @Schema(required = true, description = "The content of the field as collected in regulatory form. Note that FileAttachment type fields will contain an URL to download the attachment here.")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatedInformationField regulatedInformationField = (RegulatedInformationField) o;
    return Objects.equals(this.fieldId, regulatedInformationField.fieldId) &&
        Objects.equals(this.fieldLabel, regulatedInformationField.fieldLabel) &&
        Objects.equals(this.fieldType, regulatedInformationField.fieldType) &&
        Objects.equals(this.fieldValue, regulatedInformationField.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldLabel, fieldType, fieldValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatedInformationField {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldLabel: ").append(toIndentedString(fieldLabel)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
