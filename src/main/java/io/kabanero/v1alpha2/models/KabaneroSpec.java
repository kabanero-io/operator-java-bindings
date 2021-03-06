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
import io.kabanero.v1alpha2.models.KabaneroSpecAdmissionControllerWebhook;
import io.kabanero.v1alpha2.models.KabaneroSpecCliServices;
import io.kabanero.v1alpha2.models.KabaneroSpecCodeReadyWorkspaces;
import io.kabanero.v1alpha2.models.KabaneroSpecCollectionController;
import io.kabanero.v1alpha2.models.KabaneroSpecEvents;
import io.kabanero.v1alpha2.models.KabaneroSpecGithub;
import io.kabanero.v1alpha2.models.KabaneroSpecGitops;
import io.kabanero.v1alpha2.models.KabaneroSpecGovernancePolicy;
import io.kabanero.v1alpha2.models.KabaneroSpecLanding;
import io.kabanero.v1alpha2.models.KabaneroSpecSso;
import io.kabanero.v1alpha2.models.KabaneroSpecStackController;
import io.kabanero.v1alpha2.models.KabaneroSpecStacks;
import io.kabanero.v1alpha2.models.KabaneroSpecTriggers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * KabaneroSpec defines the desired state of Kabanero
 */
@ApiModel(description = "KabaneroSpec defines the desired state of Kabanero")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-05T21:07:19.055Z[Etc/UTC]")
public class KabaneroSpec {
  public static final String SERIALIZED_NAME_ADMISSION_CONTROLLER_WEBHOOK = "admissionControllerWebhook";
  @SerializedName(SERIALIZED_NAME_ADMISSION_CONTROLLER_WEBHOOK)
  private KabaneroSpecAdmissionControllerWebhook admissionControllerWebhook;

  public static final String SERIALIZED_NAME_CLI_SERVICES = "cliServices";
  @SerializedName(SERIALIZED_NAME_CLI_SERVICES)
  private KabaneroSpecCliServices cliServices;

  public static final String SERIALIZED_NAME_CODE_READY_WORKSPACES = "codeReadyWorkspaces";
  @SerializedName(SERIALIZED_NAME_CODE_READY_WORKSPACES)
  private KabaneroSpecCodeReadyWorkspaces codeReadyWorkspaces;

  public static final String SERIALIZED_NAME_COLLECTION_CONTROLLER = "collectionController";
  @SerializedName(SERIALIZED_NAME_COLLECTION_CONTROLLER)
  private KabaneroSpecCollectionController collectionController;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private KabaneroSpecEvents events;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private KabaneroSpecGithub github;

  public static final String SERIALIZED_NAME_GITOPS = "gitops";
  @SerializedName(SERIALIZED_NAME_GITOPS)
  private KabaneroSpecGitops gitops;

  public static final String SERIALIZED_NAME_GOVERNANCE_POLICY = "governancePolicy";
  @SerializedName(SERIALIZED_NAME_GOVERNANCE_POLICY)
  private KabaneroSpecGovernancePolicy governancePolicy;

  public static final String SERIALIZED_NAME_LANDING = "landing";
  @SerializedName(SERIALIZED_NAME_LANDING)
  private KabaneroSpecLanding landing;

  public static final String SERIALIZED_NAME_SSO = "sso";
  @SerializedName(SERIALIZED_NAME_SSO)
  private KabaneroSpecSso sso;

  public static final String SERIALIZED_NAME_STACK_CONTROLLER = "stackController";
  @SerializedName(SERIALIZED_NAME_STACK_CONTROLLER)
  private KabaneroSpecStackController stackController;

  public static final String SERIALIZED_NAME_STACKS = "stacks";
  @SerializedName(SERIALIZED_NAME_STACKS)
  private KabaneroSpecStacks stacks;

  public static final String SERIALIZED_NAME_TARGET_NAMESPACES = "targetNamespaces";
  @SerializedName(SERIALIZED_NAME_TARGET_NAMESPACES)
  private List<String> targetNamespaces = null;

  public static final String SERIALIZED_NAME_TRIGGERS = "triggers";
  @SerializedName(SERIALIZED_NAME_TRIGGERS)
  private List<KabaneroSpecTriggers> triggers = null;

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


  public KabaneroSpec codeReadyWorkspaces(KabaneroSpecCodeReadyWorkspaces codeReadyWorkspaces) {
    
    this.codeReadyWorkspaces = codeReadyWorkspaces;
    return this;
  }

   /**
   * Get codeReadyWorkspaces
   * @return codeReadyWorkspaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecCodeReadyWorkspaces getCodeReadyWorkspaces() {
    return codeReadyWorkspaces;
  }


  public void setCodeReadyWorkspaces(KabaneroSpecCodeReadyWorkspaces codeReadyWorkspaces) {
    this.codeReadyWorkspaces = codeReadyWorkspaces;
  }


  public KabaneroSpec collectionController(KabaneroSpecCollectionController collectionController) {
    
    this.collectionController = collectionController;
    return this;
  }

   /**
   * Get collectionController
   * @return collectionController
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecCollectionController getCollectionController() {
    return collectionController;
  }


  public void setCollectionController(KabaneroSpecCollectionController collectionController) {
    this.collectionController = collectionController;
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


  public KabaneroSpec gitops(KabaneroSpecGitops gitops) {
    
    this.gitops = gitops;
    return this;
  }

   /**
   * Get gitops
   * @return gitops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecGitops getGitops() {
    return gitops;
  }


  public void setGitops(KabaneroSpecGitops gitops) {
    this.gitops = gitops;
  }


  public KabaneroSpec governancePolicy(KabaneroSpecGovernancePolicy governancePolicy) {
    
    this.governancePolicy = governancePolicy;
    return this;
  }

   /**
   * Get governancePolicy
   * @return governancePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecGovernancePolicy getGovernancePolicy() {
    return governancePolicy;
  }


  public void setGovernancePolicy(KabaneroSpecGovernancePolicy governancePolicy) {
    this.governancePolicy = governancePolicy;
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


  public KabaneroSpec sso(KabaneroSpecSso sso) {
    
    this.sso = sso;
    return this;
  }

   /**
   * Get sso
   * @return sso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecSso getSso() {
    return sso;
  }


  public void setSso(KabaneroSpecSso sso) {
    this.sso = sso;
  }


  public KabaneroSpec stackController(KabaneroSpecStackController stackController) {
    
    this.stackController = stackController;
    return this;
  }

   /**
   * Get stackController
   * @return stackController
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecStackController getStackController() {
    return stackController;
  }


  public void setStackController(KabaneroSpecStackController stackController) {
    this.stackController = stackController;
  }


  public KabaneroSpec stacks(KabaneroSpecStacks stacks) {
    
    this.stacks = stacks;
    return this;
  }

   /**
   * Get stacks
   * @return stacks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KabaneroSpecStacks getStacks() {
    return stacks;
  }


  public void setStacks(KabaneroSpecStacks stacks) {
    this.stacks = stacks;
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


  public KabaneroSpec triggers(List<KabaneroSpecTriggers> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public KabaneroSpec addTriggersItem(KabaneroSpecTriggers triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<KabaneroSpecTriggers>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Get triggers
   * @return triggers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KabaneroSpecTriggers> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<KabaneroSpecTriggers> triggers) {
    this.triggers = triggers;
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
    sb.append("class KabaneroSpec {\n");
    sb.append("    admissionControllerWebhook: ").append(toIndentedString(admissionControllerWebhook)).append("\n");
    sb.append("    cliServices: ").append(toIndentedString(cliServices)).append("\n");
    sb.append("    codeReadyWorkspaces: ").append(toIndentedString(codeReadyWorkspaces)).append("\n");
    sb.append("    collectionController: ").append(toIndentedString(collectionController)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    gitops: ").append(toIndentedString(gitops)).append("\n");
    sb.append("    governancePolicy: ").append(toIndentedString(governancePolicy)).append("\n");
    sb.append("    landing: ").append(toIndentedString(landing)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    stackController: ").append(toIndentedString(stackController)).append("\n");
    sb.append("    stacks: ").append(toIndentedString(stacks)).append("\n");
    sb.append("    targetNamespaces: ").append(toIndentedString(targetNamespaces)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

