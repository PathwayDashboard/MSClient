/*******************************************************************************
 * Copyright 2018 Engineering Ing. Inf. S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ms.client.model;

import ms.client.StringUtil;
import ms.client.model.Activity;
import ms.client.model.CaloriesBurnedSummary;
import ms.client.model.HeartRateSummary;
import ms.client.model.Summary;

import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Base class for all CompositeActivity Activities
 **/
@ApiModel(description = "Base class for all CompositeActivity Activities")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class CompositeActivity   {
  
  private List<Activity> childActivities = new ArrayList<Activity>();
  private String id = null;
  private String userId = null;
  private String deviceId = null;
  private Date startTime = null;
  private Date endTime = null;
  private Date dayId = null;
  private Date createdTime = null;
  private String createdBy = null;

public enum ActivityTypeEnum {
  UNKNOWN("Unknown"), CUSTOM("Custom"), CUSTOMEXERCISE("CustomExercise"), CUSTOMCOMPOSITE("CustomComposite"), RUN("Run"), SLEEP("Sleep"), FREEPLAY("FreePlay"), GUIDEDWORKOUT("GuidedWorkout"), BIKE("Bike"), GOLF("Golf"), REGULAREXERCISE("RegularExercise");

  private String value;

  ActivityTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ActivityTypeEnum activityType = null;
  private String name = null;
  private String duration = null;
  private List<Summary> minuteSummaries = new ArrayList<Summary>();
  private CaloriesBurnedSummary caloriesBurnedSummary = null;
  private HeartRateSummary heartRateSummary = null;
  private String uvExposure = null;

  
  /**
   * The list of child activities
   **/
  @ApiModelProperty(value = "The list of child activities")
  @JsonProperty("childActivities")
  public List<Activity> getChildActivities() {
    return childActivities;
  }
  public void setChildActivities(List<Activity> childActivities) {
    this.childActivities = childActivities;
  }

  
  /**
   * The unique identifier of the activity (unique by user)
   **/
  @ApiModelProperty(value = "The unique identifier of the activity (unique by user)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The unique identifier of the user who completed the activity
   **/
  @ApiModelProperty(value = "The unique identifier of the user who completed the activity")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The identifier of the device which generated the activity
   **/
  @ApiModelProperty(value = "The identifier of the device which generated the activity")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   * The ISO 8601 formatted start time of the activity
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted start time of the activity")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The ISO 8601 formatted end time of the activity
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted end time of the activity")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The mapping of an event to a logical date. For most events, other than sleep,\n            the default assignment is based on the event's start time. This is subject to change\n            in the future. For example, if a sleep activity starts before 5 AM, the DayId is the previous day.
   **/
  @ApiModelProperty(value = "The mapping of an event to a logical date. For most events, other than sleep, the default assignment is based on the event's start time. This is subject to change in the future. For example, if a sleep activity starts before 5 AM, the DayId is the previous day.")
  @JsonProperty("dayId")
  public Date getDayId() {
    return dayId;
  }
  public void setDayId(Date dayId) {
    this.dayId = dayId;
  }

  
  /**
   * The ISO 8601 formatted time the activity was created
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted time the activity was created")
  @JsonProperty("createdTime")
  public Date getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }

  
  /**
   * The app that created the activity
   **/
  @ApiModelProperty(value = "The app that created the activity")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * The type of the activity
   **/
  @ApiModelProperty(value = "The type of the activity")
  @JsonProperty("activityType")
  public ActivityTypeEnum getActivityType() {
    return activityType;
  }
  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }

  
  /**
   * The name of the activity
   **/
  @ApiModelProperty(value = "The name of the activity")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The ISO 8601 formatted duration of the activity
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted duration of the activity")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  
  /**
   * The summaries associated with this activity
   **/
  @ApiModelProperty(value = "The summaries associated with this activity")
  @JsonProperty("minuteSummaries")
  public List<Summary> getMinuteSummaries() {
    return minuteSummaries;
  }
  public void setMinuteSummaries(List<Summary> minuteSummaries) {
    this.minuteSummaries = minuteSummaries;
  }

  
  /**
   * The summary of calories burned during the activity
   **/
  @ApiModelProperty(value = "The summary of calories burned during the activity")
  @JsonProperty("caloriesBurnedSummary")
  public CaloriesBurnedSummary getCaloriesBurnedSummary() {
    return caloriesBurnedSummary;
  }
  public void setCaloriesBurnedSummary(CaloriesBurnedSummary caloriesBurnedSummary) {
    this.caloriesBurnedSummary = caloriesBurnedSummary;
  }

  
  /**
   * The heart rate summary for the activity
   **/
  @ApiModelProperty(value = "The heart rate summary for the activity")
  @JsonProperty("heartRateSummary")
  public HeartRateSummary getHeartRateSummary() {
    return heartRateSummary;
  }
  public void setHeartRateSummary(HeartRateSummary heartRateSummary) {
    this.heartRateSummary = heartRateSummary;
  }

  
  /**
   * The UV exposure as time in the sun.
   **/
  @ApiModelProperty(value = "The UV exposure as time in the sun.")
  @JsonProperty("uvExposure")
  public String getUvExposure() {
    return uvExposure;
  }
  public void setUvExposure(String uvExposure) {
    this.uvExposure = uvExposure;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositeActivity {\n");
    
    sb.append("    childActivities: ").append(StringUtil.toIndentedString(childActivities)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    deviceId: ").append(StringUtil.toIndentedString(deviceId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    dayId: ").append(StringUtil.toIndentedString(dayId)).append("\n");
    sb.append("    createdTime: ").append(StringUtil.toIndentedString(createdTime)).append("\n");
    sb.append("    createdBy: ").append(StringUtil.toIndentedString(createdBy)).append("\n");
    sb.append("    activityType: ").append(StringUtil.toIndentedString(activityType)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    minuteSummaries: ").append(StringUtil.toIndentedString(minuteSummaries)).append("\n");
    sb.append("    caloriesBurnedSummary: ").append(StringUtil.toIndentedString(caloriesBurnedSummary)).append("\n");
    sb.append("    heartRateSummary: ").append(StringUtil.toIndentedString(heartRateSummary)).append("\n");
    sb.append("    uvExposure: ").append(StringUtil.toIndentedString(uvExposure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
