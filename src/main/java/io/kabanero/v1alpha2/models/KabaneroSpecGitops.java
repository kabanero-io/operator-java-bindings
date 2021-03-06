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
import io.kabanero.v1alpha2.models.KabaneroSpecGitopsPipelines;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * KabaneroSpecGitops
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-05T21:07:19.055Z[Etc/UTC]")
public class KabaneroSpecGitops {
  public static final String SERIALIZED_NAME_PIPELINES = "pipelines";
  @SerializedName(SERIALIZED_NAME_PIPELINES)
  private List<KabaneroSpecGitopsPipelines> pipelines = null;


  public KabaneroSpecGitops pipelines(List<KabaneroSpecGitopsPipelines> pipelines) {
    
    this.pipelines = pipelines;
    return this;
  }

  public KabaneroSpecGitops addPipelinesItem(KabaneroSpecGitopsPipelines pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<KabaneroSpecGitopsPipelines>();
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

  public List<KabaneroSpecGitopsPipelines> getPipelines() {
    return pipelines;
  }


  public void setPipelines(List<KabaneroSpecGitopsPipelines> pipelines) {
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
    sb.append("class KabaneroSpecGitops {\n");
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

