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


package io.kabanero.v1alpha1.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * IoKabaneroV1alpha1KabaneroStatusCheKabaneroCheInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-23T14:21:52.747Z[Etc/UTC]")
public class KabaneroStatusCheKabaneroCheInstance {
  public static final String SERIALIZED_NAME_CHE_IMAGE = "cheImage";
  @SerializedName(SERIALIZED_NAME_CHE_IMAGE)
  private String cheImage;

  public static final String SERIALIZED_NAME_CHE_IMAGE_TAG = "cheImageTag";
  @SerializedName(SERIALIZED_NAME_CHE_IMAGE_TAG)
  private String cheImageTag;

  public static final String SERIALIZED_NAME_CHE_WORKSPACE_CLUSTER_ROLE = "cheWorkspaceClusterRole";
  @SerializedName(SERIALIZED_NAME_CHE_WORKSPACE_CLUSTER_ROLE)
  private String cheWorkspaceClusterRole;


  public KabaneroStatusCheKabaneroCheInstance cheImage(String cheImage) {
    
    this.cheImage = cheImage;
    return this;
  }

   /**
   * Get cheImage
   * @return cheImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheImage() {
    return cheImage;
  }


  public void setCheImage(String cheImage) {
    this.cheImage = cheImage;
  }


  public KabaneroStatusCheKabaneroCheInstance cheImageTag(String cheImageTag) {
    
    this.cheImageTag = cheImageTag;
    return this;
  }

   /**
   * Get cheImageTag
   * @return cheImageTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheImageTag() {
    return cheImageTag;
  }


  public void setCheImageTag(String cheImageTag) {
    this.cheImageTag = cheImageTag;
  }


  public KabaneroStatusCheKabaneroCheInstance cheWorkspaceClusterRole(String cheWorkspaceClusterRole) {
    
    this.cheWorkspaceClusterRole = cheWorkspaceClusterRole;
    return this;
  }

   /**
   * Get cheWorkspaceClusterRole
   * @return cheWorkspaceClusterRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheWorkspaceClusterRole() {
    return cheWorkspaceClusterRole;
  }


  public void setCheWorkspaceClusterRole(String cheWorkspaceClusterRole) {
    this.cheWorkspaceClusterRole = cheWorkspaceClusterRole;
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
    sb.append("class IoKabaneroV1alpha1KabaneroStatusCheKabaneroCheInstance {\n");
    sb.append("    cheImage: ").append(toIndentedString(cheImage)).append("\n");
    sb.append("    cheImageTag: ").append(toIndentedString(cheImageTag)).append("\n");
    sb.append("    cheWorkspaceClusterRole: ").append(toIndentedString(cheWorkspaceClusterRole)).append("\n");
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

