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
import io.kabanero.v1alpha2.models.KabaneroSpecStacksGitRelease;
import io.kabanero.v1alpha2.models.KabaneroSpecStacksHttps;
import io.kabanero.v1alpha2.models.KabaneroSpecStacksPipelines;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RepositoryConfig defines customization entries for a stack.
 */
@ApiModel(description = "RepositoryConfig defines customization entries for a stack.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-20T17:26:32.414Z[Etc/UTC]")
public class KabaneroSpecStacksRepositories {
  public static final String SERIALIZED_NAME_GIT_RELEASE = "gitRelease";
  @SerializedName(SERIALIZED_NAME_GIT_RELEASE)
  private KabaneroSpecStacksGitRelease gitRelease;

  public static final String SERIALIZED_NAME_HTTPS = "https";
  @SerializedName(SERIALIZED_NAME_HTTPS)
  private KabaneroSpecStacksHttps https;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PIPELINES = "pipelines";
  @SerializedName(SERIALIZED_NAME_PIPELINES)
  private List<KabaneroSpecStacksPipelines> pipelines = null;


  public KabaneroSpecStacksRepositories gitRelease(KabaneroSpecStacksGitRelease gitRelease) {
    
    this.gitRelease = gitRelease;
    return this;
  }

   /**
   * Get gitRelease
   * @return gitRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecStacksGitRelease getGitRelease() {
    return gitRelease;
  }


  public void setGitRelease(KabaneroSpecStacksGitRelease gitRelease) {
    this.gitRelease = gitRelease;
  }


  public KabaneroSpecStacksRepositories https(KabaneroSpecStacksHttps https) {
    
    this.https = https;
    return this;
  }

   /**
   * Get https
   * @return https
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecStacksHttps getHttps() {
    return https;
  }


  public void setHttps(KabaneroSpecStacksHttps https) {
    this.https = https;
  }


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


  public KabaneroSpecStacksRepositories pipelines(List<KabaneroSpecStacksPipelines> pipelines) {
    
    this.pipelines = pipelines;
    return this;
  }

  public KabaneroSpecStacksRepositories addPipelinesItem(KabaneroSpecStacksPipelines pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<KabaneroSpecStacksPipelines>();
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

  public List<KabaneroSpecStacksPipelines> getPipelines() {
    return pipelines;
  }


  public void setPipelines(List<KabaneroSpecStacksPipelines> pipelines) {
    this.pipelines = pipelines;
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
    sb.append("    gitRelease: ").append(toIndentedString(gitRelease)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
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

