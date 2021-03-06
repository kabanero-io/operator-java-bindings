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
import io.kabanero.v1alpha2.models.StackStatusImages;
import io.kabanero.v1alpha2.models.StackStatusPipelines;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * StackVersionStatus defines the observed state of a specific stack version.
 */
@ApiModel(description = "StackVersionStatus defines the observed state of a specific stack version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-24T19:58:29.096Z[Etc/UTC]")
public class StackStatusVersions {
  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<StackStatusImages> images = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PIPELINES = "pipelines";
  @SerializedName(SERIALIZED_NAME_PIPELINES)
  private List<StackStatusPipelines> pipelines = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public StackStatusVersions images(List<StackStatusImages> images) {
    
    this.images = images;
    return this;
  }

  public StackStatusVersions addImagesItem(StackStatusImages imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<StackStatusImages>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StackStatusImages> getImages() {
    return images;
  }


  public void setImages(List<StackStatusImages> images) {
    this.images = images;
  }


  public StackStatusVersions location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public StackStatusVersions pipelines(List<StackStatusPipelines> pipelines) {
    
    this.pipelines = pipelines;
    return this;
  }

  public StackStatusVersions addPipelinesItem(StackStatusPipelines pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<StackStatusPipelines>();
    }
    this.pipelines.add(pipelinesItem);
    return this;
  }

   /**
   * Get pipelines
   * @return pipelines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StackStatusPipelines> getPipelines() {
    return pipelines;
  }


  public void setPipelines(List<StackStatusPipelines> pipelines) {
    this.pipelines = pipelines;
  }


  public StackStatusVersions status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public StackStatusVersions statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusMessage() {
    return statusMessage;
  }


  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  public StackStatusVersions version(String version) {
    
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
    sb.append("class StackStatusVersions {\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

