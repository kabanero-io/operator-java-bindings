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
 * GovernancePolicyConfig defines customization entries for governance policies.
 */
@ApiModel(description = "GovernancePolicyConfig defines customization entries for governance policies.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-24T19:58:29.096Z[Etc/UTC]")
public class KabaneroSpecGovernancePolicy {
  public static final String SERIALIZED_NAME_STACK_POLICY = "stackPolicy";
  @SerializedName(SERIALIZED_NAME_STACK_POLICY)
  private String stackPolicy;


  public KabaneroSpecGovernancePolicy stackPolicy(String stackPolicy) {
    
    this.stackPolicy = stackPolicy;
    return this;
  }

   /**
   * Get stackPolicy
   * @return stackPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStackPolicy() {
    return stackPolicy;
  }


  public void setStackPolicy(String stackPolicy) {
    this.stackPolicy = stackPolicy;
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
    sb.append("class KabaneroSpecGovernancePolicy {\n");
    sb.append("    stackPolicy: ").append(toIndentedString(stackPolicy)).append("\n");
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
