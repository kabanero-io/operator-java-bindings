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

import io.kabanero.v1alpha1.models.KabaneroSpecAdmissionControllerWebhook;
import io.kabanero.v1alpha1.models.KabaneroSpecChe;
import io.kabanero.v1alpha1.models.KabaneroSpecCliServices;
import io.kabanero.v1alpha1.models.KabaneroSpecCollections;
import io.kabanero.v1alpha1.models.KabaneroSpecEvents;
import io.kabanero.v1alpha1.models.KabaneroSpecGithub;
import io.kabanero.v1alpha1.models.KabaneroSpecLanding;
import io.kabanero.v1alpha1.models.KabaneroSpecTekton;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * IoKabaneroV1alpha1KabaneroSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-23T14:21:52.747Z[Etc/UTC]")
public class KabaneroSpec {
  public static final String SERIALIZED_NAME_ADMISSION_CONTROLLER_WEBHOOK = "admissionControllerWebhook";
  @SerializedName(SERIALIZED_NAME_ADMISSION_CONTROLLER_WEBHOOK)
  private KabaneroSpecAdmissionControllerWebhook admissionControllerWebhook;

  public static final String SERIALIZED_NAME_CHE = "che";
  @SerializedName(SERIALIZED_NAME_CHE)
  private KabaneroSpecChe che;

  public static final String SERIALIZED_NAME_CLI_SERVICES = "cliServices";
  @SerializedName(SERIALIZED_NAME_CLI_SERVICES)
  private KabaneroSpecCliServices cliServices;

  public static final String SERIALIZED_NAME_COLLECTION_CONTROLLER = "collectionController";
  @SerializedName(SERIALIZED_NAME_COLLECTION_CONTROLLER)
  private KabaneroSpecAdmissionControllerWebhook collectionController;

  public static final String SERIALIZED_NAME_COLLECTIONS = "collections";
  @SerializedName(SERIALIZED_NAME_COLLECTIONS)
  private KabaneroSpecCollections collections;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private KabaneroSpecEvents events;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private KabaneroSpecGithub github;

  public static final String SERIALIZED_NAME_LANDING = "landing";
  @SerializedName(SERIALIZED_NAME_LANDING)
  private KabaneroSpecLanding landing;

  public static final String SERIALIZED_NAME_TARGET_NAMESPACES = "targetNamespaces";
  @SerializedName(SERIALIZED_NAME_TARGET_NAMESPACES)
  private List<String> targetNamespaces = null;

  public static final String SERIALIZED_NAME_TEKTON = "tekton";
  @SerializedName(SERIALIZED_NAME_TEKTON)
  private KabaneroSpecTekton tekton;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public KabaneroSpec admissionControllerWebhook(KabaneroSpecAdmissionControllerWebhook admissionControllerWebhook) {
    
    this.admissionControllerWebhook = admissionControllerWebhook;
    return this;
  }

   /**
   * Get admissionControllerWebhook
   * @return admissionControllerWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecAdmissionControllerWebhook getAdmissionControllerWebhook() {
    return admissionControllerWebhook;
  }


  public void setAdmissionControllerWebhook(KabaneroSpecAdmissionControllerWebhook admissionControllerWebhook) {
    this.admissionControllerWebhook = admissionControllerWebhook;
  }


  public KabaneroSpec che(KabaneroSpecChe che) {
    
    this.che = che;
    return this;
  }

   /**
   * Get che
   * @return che
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecChe getChe() {
    return che;
  }


  public void setChe(KabaneroSpecChe che) {
    this.che = che;
  }


  public KabaneroSpec cliServices(KabaneroSpecCliServices cliServices) {
    
    this.cliServices = cliServices;
    return this;
  }

   /**
   * Get cliServices
   * @return cliServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecCliServices getCliServices() {
    return cliServices;
  }


  public void setCliServices(KabaneroSpecCliServices cliServices) {
    this.cliServices = cliServices;
  }


  public KabaneroSpec collectionController(KabaneroSpecAdmissionControllerWebhook collectionController) {
    
    this.collectionController = collectionController;
    return this;
  }

   /**
   * Get collectionController
   * @return collectionController
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecAdmissionControllerWebhook getCollectionController() {
    return collectionController;
  }


  public void setCollectionController(KabaneroSpecAdmissionControllerWebhook collectionController) {
    this.collectionController = collectionController;
  }


  public KabaneroSpec collections(KabaneroSpecCollections collections) {
    
    this.collections = collections;
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecCollections getCollections() {
    return collections;
  }


  public void setCollections(KabaneroSpecCollections collections) {
    this.collections = collections;
  }


  public KabaneroSpec events(KabaneroSpecEvents events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecEvents getEvents() {
    return events;
  }


  public void setEvents(KabaneroSpecEvents events) {
    this.events = events;
  }


  public KabaneroSpec github(KabaneroSpecGithub github) {
    
    this.github = github;
    return this;
  }

   /**
   * Get github
   * @return github
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecGithub getGithub() {
    return github;
  }


  public void setGithub(KabaneroSpecGithub github) {
    this.github = github;
  }


  public KabaneroSpec landing(KabaneroSpecLanding landing) {
    
    this.landing = landing;
    return this;
  }

   /**
   * Get landing
   * @return landing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecLanding getLanding() {
    return landing;
  }


  public void setLanding(KabaneroSpecLanding landing) {
    this.landing = landing;
  }


  public KabaneroSpec targetNamespaces(List<String> targetNamespaces) {
    
    this.targetNamespaces = targetNamespaces;
    return this;
  }

  public KabaneroSpec addTargetNamespacesItem(String targetNamespacesItem) {
    if (this.targetNamespaces == null) {
      this.targetNamespaces = new ArrayList<String>();
    }
    this.targetNamespaces.add(targetNamespacesItem);
    return this;
  }

   /**
   * Get targetNamespaces
   * @return targetNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTargetNamespaces() {
    return targetNamespaces;
  }


  public void setTargetNamespaces(List<String> targetNamespaces) {
    this.targetNamespaces = targetNamespaces;
  }


  public KabaneroSpec tekton(KabaneroSpecTekton tekton) {
    
    this.tekton = tekton;
    return this;
  }

   /**
   * Get tekton
   * @return tekton
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecTekton getTekton() {
    return tekton;
  }


  public void setTekton(KabaneroSpecTekton tekton) {
    this.tekton = tekton;
  }


  public KabaneroSpec version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
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
    sb.append("class IoKabaneroV1alpha1KabaneroSpec {\n");
    sb.append("    admissionControllerWebhook: ").append(toIndentedString(admissionControllerWebhook)).append("\n");
    sb.append("    che: ").append(toIndentedString(che)).append("\n");
    sb.append("    cliServices: ").append(toIndentedString(cliServices)).append("\n");
    sb.append("    collectionController: ").append(toIndentedString(collectionController)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    landing: ").append(toIndentedString(landing)).append("\n");
    sb.append("    targetNamespaces: ").append(toIndentedString(targetNamespaces)).append("\n");
    sb.append("    tekton: ").append(toIndentedString(tekton)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

