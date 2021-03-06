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
import java.util.ArrayList;
import java.util.List;

/**
 * GithubConfig represents the Github information (public or GHE) where the organization and teams managing the stacks live.  Members of the specified team in the specified organization will have admin authority in the Kabanero CLI.
 */
@ApiModel(description = "GithubConfig represents the Github information (public or GHE) where the organization and teams managing the stacks live.  Members of the specified team in the specified organization will have admin authority in the Kabanero CLI.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-20T17:26:32.414Z[Etc/UTC]")
public class KabaneroSpecGithub {
  public static final String SERIALIZED_NAME_API_URL = "apiUrl";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<String> teams = null;


  public KabaneroSpecGithub apiUrl(String apiUrl) {
    
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiUrl() {
    return apiUrl;
  }


  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public KabaneroSpecGithub organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public KabaneroSpecGithub teams(List<String> teams) {
    
    this.teams = teams;
    return this;
  }

  public KabaneroSpecGithub addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<String>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTeams() {
    return teams;
  }


  public void setTeams(List<String> teams) {
    this.teams = teams;
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
    sb.append("class KabaneroSpecGithub {\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

