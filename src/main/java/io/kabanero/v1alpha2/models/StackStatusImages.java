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
import io.kabanero.v1alpha2.models.StackStatusDigest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ImageStatus defines a container image status used by a stack
 */
@ApiModel(description = "ImageStatus defines a container image status used by a stack")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-24T19:58:29.096Z[Etc/UTC]")
public class StackStatusImages {
  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private StackStatusDigest digest;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;


  public StackStatusImages digest(StackStatusDigest digest) {
    
    this.digest = digest;
    return this;
  }

   /**
   * Get digest
   * @return digest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StackStatusDigest getDigest() {
    return digest;
  }


  public void setDigest(StackStatusDigest digest) {
    this.digest = digest;
  }


  public StackStatusImages id(String id) {
    
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


  public StackStatusImages image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
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
    sb.append("class StackStatusImages {\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

