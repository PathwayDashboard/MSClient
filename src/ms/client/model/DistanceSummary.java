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

import io.swagger.annotations.*;
import ms.client.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Distance Related Summary Information
 **/
@ApiModel(description = "Distance Related Summary Information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class DistanceSummary   {
  

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
  private Long totalDistance = null;
  private Long totalDistanceOnFoot = null;
  private Long actualDistance = null;
  private Integer elevationGain = null;
  private Integer elevationLoss = null;
  private Integer maxElevation = null;
  private Integer minElevation = null;
  private Long waypointDistance = null;
  private Integer speed = null;
  private Integer pace = null;
  private Integer overallPace = null;

  
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
   * The total distance during the period.\n            If this is a time-based summary, e.g. hourly or daily, then this is the total distance of the period.\n            If this is an activity split summary, e.g. splits of a run, then this is the split distance, e.g. 1 mile, 1 kilometer.\n            For the last split of the activity, this value may be less than the full split distance.
   **/
  @ApiModelProperty(value = "The total distance during the period. If this is a time-based summary, e.g. hourly or daily, then this is the total distance of the period. If this is an activity split summary, e.g. splits of a run, then this is the split distance, e.g. 1 mile, 1 kilometer.  For the last split of the activity, this value may be less than the full split distance.")
  @JsonProperty("totalDistance")
  public Long getTotalDistance() {
    return totalDistance;
  }
  public void setTotalDistance(Long totalDistance) {
    this.totalDistance = totalDistance;
  }

  
  /**
   * The total distance covered on foot during the period
   **/
  @ApiModelProperty(value = "The total distance covered on foot during the period")
  @JsonProperty("totalDistanceOnFoot")
  public Long getTotalDistanceOnFoot() {
    return totalDistanceOnFoot;
  }
  public void setTotalDistanceOnFoot(Long totalDistanceOnFoot) {
    this.totalDistanceOnFoot = totalDistanceOnFoot;
  }

  
  /**
   * The absolute distance including any paused time distance during the period
   **/
  @ApiModelProperty(value = "The absolute distance including any paused time distance during the period")
  @JsonProperty("actualDistance")
  public Long getActualDistance() {
    return actualDistance;
  }
  public void setActualDistance(Long actualDistance) {
    this.actualDistance = actualDistance;
  }

  
  /**
   * The cumulative elevation gain accrued during the period in cm
   **/
  @ApiModelProperty(value = "The cumulative elevation gain accrued during the period in cm")
  @JsonProperty("elevationGain")
  public Integer getElevationGain() {
    return elevationGain;
  }
  public void setElevationGain(Integer elevationGain) {
    this.elevationGain = elevationGain;
  }

  
  /**
   * The cumulative elevation loss accrued during this period in cm
   **/
  @ApiModelProperty(value = "The cumulative elevation loss accrued during this period in cm")
  @JsonProperty("elevationLoss")
  public Integer getElevationLoss() {
    return elevationLoss;
  }
  public void setElevationLoss(Integer elevationLoss) {
    this.elevationLoss = elevationLoss;
  }

  
  /**
   * The maximum elevation during this period in cm
   **/
  @ApiModelProperty(value = "The maximum elevation during this period in cm")
  @JsonProperty("maxElevation")
  public Integer getMaxElevation() {
    return maxElevation;
  }
  public void setMaxElevation(Integer maxElevation) {
    this.maxElevation = maxElevation;
  }

  
  /**
   * The minimum elevation during this period in cm
   **/
  @ApiModelProperty(value = "The minimum elevation during this period in cm")
  @JsonProperty("minElevation")
  public Integer getMinElevation() {
    return minElevation;
  }
  public void setMinElevation(Integer minElevation) {
    this.minElevation = minElevation;
  }

  
  /**
   * The distance in cm between recorded GPS points
   **/
  @ApiModelProperty(value = "The distance in cm between recorded GPS points")
  @JsonProperty("waypointDistance")
  public Long getWaypointDistance() {
    return waypointDistance;
  }
  public void setWaypointDistance(Long waypointDistance) {
    this.waypointDistance = waypointDistance;
  }

  
  /**
   * The average speed during the period
   **/
  @ApiModelProperty(value = "The average speed during the period")
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  
  /**
   * The average pace during the period
   **/
  @ApiModelProperty(value = "The average pace during the period")
  @JsonProperty("pace")
  public Integer getPace() {
    return pace;
  }
  public void setPace(Integer pace) {
    this.pace = pace;
  }

  
  /**
   * The total distance to the end of this period divided by total time to the end of this period
   **/
  @ApiModelProperty(value = "The total distance to the end of this period divided by total time to the end of this period")
  @JsonProperty("overallPace")
  public Integer getOverallPace() {
    return overallPace;
  }
  public void setOverallPace(Integer overallPace) {
    this.overallPace = overallPace;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistanceSummary {\n");
    
    sb.append("    period: ").append(StringUtil.toIndentedString(period)).append("\n");
    sb.append("    totalDistance: ").append(StringUtil.toIndentedString(totalDistance)).append("\n");
    sb.append("    totalDistanceOnFoot: ").append(StringUtil.toIndentedString(totalDistanceOnFoot)).append("\n");
    sb.append("    actualDistance: ").append(StringUtil.toIndentedString(actualDistance)).append("\n");
    sb.append("    elevationGain: ").append(StringUtil.toIndentedString(elevationGain)).append("\n");
    sb.append("    elevationLoss: ").append(StringUtil.toIndentedString(elevationLoss)).append("\n");
    sb.append("    maxElevation: ").append(StringUtil.toIndentedString(maxElevation)).append("\n");
    sb.append("    minElevation: ").append(StringUtil.toIndentedString(minElevation)).append("\n");
    sb.append("    waypointDistance: ").append(StringUtil.toIndentedString(waypointDistance)).append("\n");
    sb.append("    speed: ").append(StringUtil.toIndentedString(speed)).append("\n");
    sb.append("    pace: ").append(StringUtil.toIndentedString(pace)).append("\n");
    sb.append("    overallPace: ").append(StringUtil.toIndentedString(overallPace)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
