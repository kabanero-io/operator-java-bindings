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

import io.kabanero.v1alpha1.models.KabaneroSpecCollectionsRepositories;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * IoKabaneroV1alpha1KabaneroSpecCollections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-23T14:21:52.747Z[Etc/UTC]")
public class KabaneroSpecCollections {
  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<KabaneroSpecCollectionsRepositories> repositories = null;


  public KabaneroSpecCollections repositories(List<KabaneroSpecCollectionsRepositories> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public KabaneroSpecCollections addRepositoriesItem(KabaneroSpecCollectionsRepositories repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<KabaneroSpecCollectionsRepositories>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KabaneroSpecCollectionsRepositories> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<KabaneroSpecCollectionsRepositories> repositories) {
    this.repositories = repositories;
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
    sb.append("class IoKabaneroV1alpha1KabaneroSpecCollections {\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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

