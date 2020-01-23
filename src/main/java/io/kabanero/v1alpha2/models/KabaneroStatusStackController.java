/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.17.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kabanero.v1alpha2.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Kabanero stack controller readiness status.
 */
@ApiModel(description = "Kabanero stack controller readiness status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-23T16:20:08.986Z[Etc/UTC]")
public class KabaneroStatusStackController {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private String ready;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public KabaneroStatusStackController errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public KabaneroStatusStackController ready(String ready) {
    
    this.ready = ready;
    return this;
  }

   /**
   * Get ready
   * @return ready
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReady() {
    return ready;
  }


  public void setReady(String ready) {
    this.ready = ready;
  }


  public KabaneroStatusStackController version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KabaneroStatusStackController {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

