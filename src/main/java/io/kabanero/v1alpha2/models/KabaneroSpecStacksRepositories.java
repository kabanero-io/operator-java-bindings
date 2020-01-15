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
 * RepositoryConfig defines customization entries for a stack.
 */
@ApiModel(description = "RepositoryConfig defines customization entries for a stack.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-15T21:34:41.694Z[Etc/UTC]")
public class KabaneroSpecStacksRepositories {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SKIP_CERT_VERIFICATION = "skipCertVerification";
  @SerializedName(SERIALIZED_NAME_SKIP_CERT_VERIFICATION)
  private Boolean skipCertVerification;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public KabaneroSpecStacksRepositories name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KabaneroSpecStacksRepositories skipCertVerification(Boolean skipCertVerification) {
    
    this.skipCertVerification = skipCertVerification;
    return this;
  }

   /**
   * Get skipCertVerification
   * @return skipCertVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSkipCertVerification() {
    return skipCertVerification;
  }


  public void setSkipCertVerification(Boolean skipCertVerification) {
    this.skipCertVerification = skipCertVerification;
  }


  public KabaneroSpecStacksRepositories url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    sb.append("class KabaneroSpecStacksRepositories {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    skipCertVerification: ").append(toIndentedString(skipCertVerification)).append("\n");
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

