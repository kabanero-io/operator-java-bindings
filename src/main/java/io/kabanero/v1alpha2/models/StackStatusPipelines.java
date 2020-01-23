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
import io.kabanero.v1alpha2.models.StackStatusActiveAssets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PipelineStatus defines the observed state of the assets located within a single pipeline .tar.gz.
 */
@ApiModel(description = "PipelineStatus defines the observed state of the assets located within a single pipeline .tar.gz.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-23T16:41:30.881Z[Etc/UTC]")
public class StackStatusPipelines {
  public static final String SERIALIZED_NAME_ACTIVE_ASSETS = "activeAssets";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ASSETS)
  private List<StackStatusActiveAssets> activeAssets = null;

  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public StackStatusPipelines activeAssets(List<StackStatusActiveAssets> activeAssets) {
    
    this.activeAssets = activeAssets;
    return this;
  }

  public StackStatusPipelines addActiveAssetsItem(StackStatusActiveAssets activeAssetsItem) {
    if (this.activeAssets == null) {
      this.activeAssets = new ArrayList<StackStatusActiveAssets>();
    }
    this.activeAssets.add(activeAssetsItem);
    return this;
  }

   /**
   * Get activeAssets
   * @return activeAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StackStatusActiveAssets> getActiveAssets() {
    return activeAssets;
  }


  public void setActiveAssets(List<StackStatusActiveAssets> activeAssets) {
    this.activeAssets = activeAssets;
  }


  public StackStatusPipelines digest(String digest) {
    
    this.digest = digest;
    return this;
  }

   /**
   * Get digest
   * @return digest
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDigest() {
    return digest;
  }


  public void setDigest(String digest) {
    this.digest = digest;
  }


  public StackStatusPipelines name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StackStatusPipelines url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
    sb.append("class StackStatusPipelines {\n");
    sb.append("    activeAssets: ").append(toIndentedString(activeAssets)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

