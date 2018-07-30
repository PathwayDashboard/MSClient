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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * Summary information over a period of time
 **/
@ApiModel(description = "Summary information over a period of time")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class Summary   {
  
  private String userId = null;
  private Date startTime = null;
  private Date endTime = null;
  private Date parentDay = null;
  private Boolean isTransitDay = null;

public enum PeriodEnum {
  UNKNOWN("Unknown"), ACTIVITY("Activity"), MINUTE("Minute"), QUARTERHOURLY("QuarterHourly"), HALFHOURLY("HalfHourly"), HOURLY("Hourly"), DAILY("Daily"), WEEKLY("Weekly"), lAST30DAYS("Last30Days"), CALENDARMONTH("CalendarMonth"), lAST90DAYS("Last90Days"), CALENDARYEAR("CalendarYear"), lAST365DAYS("Last365Days"), SEGMENT("Segment");

  private String value;

  PeriodEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private PeriodEnum period = null;
  private String duration = null;
  private Integer stepsTaken = null;
  private CaloriesBurnedSummary caloriesBurnedSummary = null;
  private HeartRateSummary heartRateSummary = null;
  private DistanceSummary distanceSummary = null;
  private Integer activeHours = null;
  private String uvExposure = null;

  
  /**
   * The unique identifier of the user
   **/
  @ApiModelProperty(value = "The unique identifier of the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The ISO 8601 formatted start time of the period
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted start time of the period")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The ISO 8601 formatted end time of the period
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted end time of the period")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The ISO 8601 formatted parent day of the period
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted parent day of the period")
  @JsonProperty("parentDay")
  public Date getParentDay() {
    return parentDay;
  }
  public void setParentDay(Date parentDay) {
    this.parentDay = parentDay;
  }

  
  /**
   * True if the user transitioned time zones during this period, else false
   **/
  @ApiModelProperty(value = "True if the user transitioned time zones during this period, else false")
  @JsonProperty("isTransitDay")
  public Boolean getIsTransitDay() {
    return isTransitDay;
  }
  public void setIsTransitDay(Boolean isTransitDay) {
    this.isTransitDay = isTransitDay;
  }

  
  /**
   * The length of the time bucket for which the summary is calculated
   **/
  @ApiModelProperty(value = "The length of the time bucket for which the summary is calculated")
  @JsonProperty("period")
  public PeriodEnum getPeriod() {
    return period;
  }
  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  
  /**
   * The ISO 8601 formatted duration of the period
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted duration of the period")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  
  /**
   * The total number of steps taken during the period
   **/
  @ApiModelProperty(value = "The total number of steps taken during the period")
  @JsonProperty("stepsTaken")
  public Integer getStepsTaken() {
    return stepsTaken;
  }
  public void setStepsTaken(Integer stepsTaken) {
    this.stepsTaken = stepsTaken;
  }

  
  /**
   * The summary of the calories burned during the period
   **/
  @ApiModelProperty(value = "The summary of the calories burned during the period")
  @JsonProperty("caloriesBurnedSummary")
  public CaloriesBurnedSummary getCaloriesBurnedSummary() {
    return caloriesBurnedSummary;
  }
  public void setCaloriesBurnedSummary(CaloriesBurnedSummary caloriesBurnedSummary) {
    this.caloriesBurnedSummary = caloriesBurnedSummary;
  }

  
  /**
   * The summary of heart rate data during the period
   **/
  @ApiModelProperty(value = "The summary of heart rate data during the period")
  @JsonProperty("heartRateSummary")
  public HeartRateSummary getHeartRateSummary() {
    return heartRateSummary;
  }
  public void setHeartRateSummary(HeartRateSummary heartRateSummary) {
    this.heartRateSummary = heartRateSummary;
  }

  
  /**
   * The summary of the distance data during the period
   **/
  @ApiModelProperty(value = "The summary of the distance data during the period")
  @JsonProperty("distanceSummary")
  public DistanceSummary getDistanceSummary() {
    return distanceSummary;
  }
  public void setDistanceSummary(DistanceSummary distanceSummary) {
    this.distanceSummary = distanceSummary;
  }

  
  /**
   * The number of active hours during the period
   **/
  @ApiModelProperty(value = "The number of active hours during the period")
  @JsonProperty("activeHours")
  public Integer getActiveHours() {
    return activeHours;
  }
  public void setActiveHours(Integer activeHours) {
    this.activeHours = activeHours;
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
    sb.append("class Summary {\n");
    
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    parentDay: ").append(StringUtil.toIndentedString(parentDay)).append("\n");
    sb.append("    isTransitDay: ").append(StringUtil.toIndentedString(isTransitDay)).append("\n");
    sb.append("    period: ").append(StringUtil.toIndentedString(period)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    stepsTaken: ").append(StringUtil.toIndentedString(stepsTaken)).append("\n");
    sb.append("    caloriesBurnedSummary: ").append(StringUtil.toIndentedString(caloriesBurnedSummary)).append("\n");
    sb.append("    heartRateSummary: ").append(StringUtil.toIndentedString(heartRateSummary)).append("\n");
    sb.append("    distanceSummary: ").append(StringUtil.toIndentedString(distanceSummary)).append("\n");
    sb.append("    activeHours: ").append(StringUtil.toIndentedString(activeHours)).append("\n");
    sb.append("    uvExposure: ").append(StringUtil.toIndentedString(uvExposure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
