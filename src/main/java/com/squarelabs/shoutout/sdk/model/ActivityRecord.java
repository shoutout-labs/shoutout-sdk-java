package com.squarelabs.shoutout.sdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * ActivityRecord
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class ActivityRecord   {
  
  private String userId = null;
  private String activityId = null;
  private String activityName = null;
  private Object activityData = null;

  
  /**
   **/
  public ActivityRecord userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public ActivityRecord activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activity_id")
  public String getActivityId() {
    return activityId;
  }
  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  /**
   **/
  public ActivityRecord activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activity_name")
  public String getActivityName() {
    return activityName;
  }
  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  /**
   **/
  public ActivityRecord activityData(Object activityData) {
    this.activityData = activityData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activity_data")
  public Object getActivityData() {
    return activityData;
  }
  public void setActivityData(Object activityData) {
    this.activityData = activityData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityRecord activityRecord = (ActivityRecord) o;
    return Objects.equals(this.userId, activityRecord.userId) &&
        Objects.equals(this.activityId, activityRecord.activityId) &&
        Objects.equals(this.activityName, activityRecord.activityName) &&
        Objects.equals(this.activityData, activityRecord.activityData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, activityId, activityName, activityData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityRecord {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityData: ").append(toIndentedString(activityData)).append("\n");
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

