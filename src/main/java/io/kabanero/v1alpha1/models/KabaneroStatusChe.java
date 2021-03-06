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

import io.kabanero.v1alpha1.models.KabaneroStatusCheCheOperator;
import io.kabanero.v1alpha1.models.KabaneroStatusCheKabaneroCheInstance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Che instance readiness status.
 */
@ApiModel(description = "Che instance readiness status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-23T14:21:52.747Z[Etc/UTC]")
public class KabaneroStatusChe {
  public static final String SERIALIZED_NAME_CHE_OPERATOR = "cheOperator";
  @SerializedName(SERIALIZED_NAME_CHE_OPERATOR)
  private KabaneroStatusCheCheOperator cheOperator;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_KABANERO_CHE = "kabaneroChe";
  @SerializedName(SERIALIZED_NAME_KABANERO_CHE)
  private KabaneroStatusCheCheOperator kabaneroChe;

  public static final String SERIALIZED_NAME_KABANERO_CHE_INSTANCE = "kabaneroCheInstance";
  @SerializedName(SERIALIZED_NAME_KABANERO_CHE_INSTANCE)
  private KabaneroStatusCheKabaneroCheInstance kabaneroCheInstance;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private String ready;


  public KabaneroStatusChe cheOperator(KabaneroStatusCheCheOperator cheOperator) {
    
    this.cheOperator = cheOperator;
    return this;
  }

   /**
   * Get cheOperator
   * @return cheOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroStatusCheCheOperator getCheOperator() {
    return cheOperator;
  }


  public void setCheOperator(KabaneroStatusCheCheOperator cheOperator) {
    this.cheOperator = cheOperator;
  }


  public KabaneroStatusChe errorMessage(String errorMessage) {
    
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


  public KabaneroStatusChe kabaneroChe(KabaneroStatusCheCheOperator kabaneroChe) {
    
    this.kabaneroChe = kabaneroChe;
    return this;
  }

   /**
   * Get kabaneroChe
   * @return kabaneroChe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroStatusCheCheOperator getKabaneroChe() {
    return kabaneroChe;
  }


  public void setKabaneroChe(KabaneroStatusCheCheOperator kabaneroChe) {
    this.kabaneroChe = kabaneroChe;
  }


  public KabaneroStatusChe kabaneroCheInstance(KabaneroStatusCheKabaneroCheInstance kabaneroCheInstance) {
    
    this.kabaneroCheInstance = kabaneroCheInstance;
    return this;
  }

   /**
   * Get kabaneroCheInstance
   * @return kabaneroCheInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroStatusCheKabaneroCheInstance getKabaneroCheInstance() {
    return kabaneroCheInstance;
  }


  public void setKabaneroCheInstance(KabaneroStatusCheKabaneroCheInstance kabaneroCheInstance) {
    this.kabaneroCheInstance = kabaneroCheInstance;
  }


  public KabaneroStatusChe ready(String ready) {
    
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
    sb.append("class IoKabaneroV1alpha1KabaneroStatusChe {\n");
    sb.append("    cheOperator: ").append(toIndentedString(cheOperator)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    kabaneroChe: ").append(toIndentedString(kabaneroChe)).append("\n");
    sb.append("    kabaneroCheInstance: ").append(toIndentedString(kabaneroCheInstance)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
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

