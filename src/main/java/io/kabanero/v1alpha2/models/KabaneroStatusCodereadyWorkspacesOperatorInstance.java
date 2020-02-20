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
 * CRWInstanceStatus defines the observed status details of the codeready-workspaces operator custom resource.
 */
@ApiModel(description = "CRWInstanceStatus defines the observed status details of the codeready-workspaces operator custom resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-20T17:26:32.414Z[Etc/UTC]")
public class KabaneroStatusCodereadyWorkspacesOperatorInstance {
  public static final String SERIALIZED_NAME_CHE_WORKSPACE_CLUSTER_ROLE = "cheWorkspaceClusterRole";
  @SerializedName(SERIALIZED_NAME_CHE_WORKSPACE_CLUSTER_ROLE)
  private String cheWorkspaceClusterRole;

  public static final String SERIALIZED_NAME_DEVFILE_REGISTRY_IMAGE = "devfileRegistryImage";
  @SerializedName(SERIALIZED_NAME_DEVFILE_REGISTRY_IMAGE)
  private String devfileRegistryImage;

  public static final String SERIALIZED_NAME_OPEN_SHIFT_O_AUTH = "openShiftOAuth";
  @SerializedName(SERIALIZED_NAME_OPEN_SHIFT_O_AUTH)
  private Boolean openShiftOAuth;

  public static final String SERIALIZED_NAME_SELF_SIGNED_CERT = "selfSignedCert";
  @SerializedName(SERIALIZED_NAME_SELF_SIGNED_CERT)
  private Boolean selfSignedCert;

  public static final String SERIALIZED_NAME_TLS_SUPPORT = "tlsSupport";
  @SerializedName(SERIALIZED_NAME_TLS_SUPPORT)
  private Boolean tlsSupport;


  public KabaneroStatusCodereadyWorkspacesOperatorInstance cheWorkspaceClusterRole(String cheWorkspaceClusterRole) {
    
    this.cheWorkspaceClusterRole = cheWorkspaceClusterRole;
    return this;
  }

   /**
   * Get cheWorkspaceClusterRole
   * @return cheWorkspaceClusterRole
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCheWorkspaceClusterRole() {
    return cheWorkspaceClusterRole;
  }


  public void setCheWorkspaceClusterRole(String cheWorkspaceClusterRole) {
    this.cheWorkspaceClusterRole = cheWorkspaceClusterRole;
  }


  public KabaneroStatusCodereadyWorkspacesOperatorInstance devfileRegistryImage(String devfileRegistryImage) {
    
    this.devfileRegistryImage = devfileRegistryImage;
    return this;
  }

   /**
   * Get devfileRegistryImage
   * @return devfileRegistryImage
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDevfileRegistryImage() {
    return devfileRegistryImage;
  }


  public void setDevfileRegistryImage(String devfileRegistryImage) {
    this.devfileRegistryImage = devfileRegistryImage;
  }


  public KabaneroStatusCodereadyWorkspacesOperatorInstance openShiftOAuth(Boolean openShiftOAuth) {
    
    this.openShiftOAuth = openShiftOAuth;
    return this;
  }

   /**
   * Get openShiftOAuth
   * @return openShiftOAuth
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getOpenShiftOAuth() {
    return openShiftOAuth;
  }


  public void setOpenShiftOAuth(Boolean openShiftOAuth) {
    this.openShiftOAuth = openShiftOAuth;
  }


  public KabaneroStatusCodereadyWorkspacesOperatorInstance selfSignedCert(Boolean selfSignedCert) {
    
    this.selfSignedCert = selfSignedCert;
    return this;
  }

   /**
   * Get selfSignedCert
   * @return selfSignedCert
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getSelfSignedCert() {
    return selfSignedCert;
  }


  public void setSelfSignedCert(Boolean selfSignedCert) {
    this.selfSignedCert = selfSignedCert;
  }


  public KabaneroStatusCodereadyWorkspacesOperatorInstance tlsSupport(Boolean tlsSupport) {
    
    this.tlsSupport = tlsSupport;
    return this;
  }

   /**
   * Get tlsSupport
   * @return tlsSupport
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getTlsSupport() {
    return tlsSupport;
  }


  public void setTlsSupport(Boolean tlsSupport) {
    this.tlsSupport = tlsSupport;
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
    sb.append("class KabaneroStatusCodereadyWorkspacesOperatorInstance {\n");
    sb.append("    cheWorkspaceClusterRole: ").append(toIndentedString(cheWorkspaceClusterRole)).append("\n");
    sb.append("    devfileRegistryImage: ").append(toIndentedString(devfileRegistryImage)).append("\n");
    sb.append("    openShiftOAuth: ").append(toIndentedString(openShiftOAuth)).append("\n");
    sb.append("    selfSignedCert: ").append(toIndentedString(selfSignedCert)).append("\n");
    sb.append("    tlsSupport: ").append(toIndentedString(tlsSupport)).append("\n");
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

