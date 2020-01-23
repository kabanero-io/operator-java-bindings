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
import io.kabanero.v1alpha2.models.StackSpecHttps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PipelineSpec defines the sets of default pipelines for the stacks.
 */
@ApiModel(description = "PipelineSpec defines the sets of default pipelines for the stacks.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-23T16:41:30.881Z[Etc/UTC]")
public class StackSpecPipelines {
  public static final String SERIALIZED_NAME_HTTPS = "https";
  @SerializedName(SERIALIZED_NAME_HTTPS)
  private StackSpecHttps https;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;


  public StackSpecPipelines https(StackSpecHttps https) {
    
    this.https = https;
    return this;
  }

   /**
   * Get https
   * @return https
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StackSpecHttps getHttps() {
    return https;
  }


  public void setHttps(StackSpecHttps https) {
    this.https = https;
  }


  public StackSpecPipelines id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StackSpecPipelines sha256(String sha256) {
    
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSha256() {
    return sha256;
  }


  public void setSha256(String sha256) {
    this.sha256 = sha256;
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
    sb.append("class StackSpecPipelines {\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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

