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
import ms.client.model.GPSPoint;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Map Point Summary Data
 **/
@ApiModel(description = "Map Point Summary Data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class MapPoint   {
  
  private Integer secondsSinceStart = null;

public enum MapPointTypeEnum {
  UNKNOWN("Unknown"), START("Start"), END("End"), SPLIT("Split"), WAYPOINT("Waypoint");

  private String value;

  MapPointTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private MapPointTypeEnum mapPointType = null;
  private Integer ordinal = null;
  private Long actualDistance = null;
  private Long totalDistance = null;
  private Integer heartRate = null;
  private Integer pace = null;
  private Integer scaledPace = null;
  private Integer speed = null;
  private GPSPoint location = null;
  private Boolean isPaused = null;
  private Boolean isResume = null;

  
  /**
   * The number of seconds that have elapsed since mapping began, typically the start of a run or other activity
   **/
  @ApiModelProperty(value = "The number of seconds that have elapsed since mapping began, typically the start of a run or other activity")
  @JsonProperty("secondsSinceStart")
  public Integer getSecondsSinceStart() {
    return secondsSinceStart;
  }
  public void setSecondsSinceStart(Integer secondsSinceStart) {
    this.secondsSinceStart = secondsSinceStart;
  }

  
  /**
   * The type of map point
   **/
  @ApiModelProperty(value = "The type of map point")
  @JsonProperty("mapPointType")
  public MapPointTypeEnum getMapPointType() {
    return mapPointType;
  }
  public void setMapPointType(MapPointTypeEnum mapPointType) {
    this.mapPointType = mapPointType;
  }

  
  /**
   * The absolute ordering of this point relative to the others in its set, starting from 0
   **/
  @ApiModelProperty(value = "The absolute ordering of this point relative to the others in its set, starting from 0")
  @JsonProperty("ordinal")
  public Integer getOrdinal() {
    return ordinal;
  }
  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  
  /**
   * The distance not including distance traveled while paused, it is the distance that splits are based off of, since splits ignore paused time
   **/
  @ApiModelProperty(value = "The distance not including distance traveled while paused, it is the distance that splits are based off of, since splits ignore paused time")
  @JsonProperty("actualDistance")
  public Long getActualDistance() {
    return actualDistance;
  }
  public void setActualDistance(Long actualDistance) {
    this.actualDistance = actualDistance;
  }

  
  /**
   * The total distance from the start point to this map point
   **/
  @ApiModelProperty(value = "The total distance from the start point to this map point")
  @JsonProperty("totalDistance")
  public Long getTotalDistance() {
    return totalDistance;
  }
  public void setTotalDistance(Long totalDistance) {
    this.totalDistance = totalDistance;
  }

  
  /**
   * The heart rate at the time of this map point
   **/
  @ApiModelProperty(value = "The heart rate at the time of this map point")
  @JsonProperty("heartRate")
  public Integer getHeartRate() {
    return heartRate;
  }
  public void setHeartRate(Integer heartRate) {
    this.heartRate = heartRate;
  }

  
  /**
   * The pace
   **/
  @ApiModelProperty(value = "The pace")
  @JsonProperty("pace")
  public Integer getPace() {
    return pace;
  }
  public void setPace(Integer pace) {
    this.pace = pace;
  }

  
  /**
   * A number between 0 and 100 that denotes the pace/speed between the slowest and fastest instantaneous pace for the\n            overall route. Slowest segment in the route (highest pace, lowest speed) is 0 and fastest segment\n            (lowest pace, highest speed) is 100. Only makes sense in the context of the set of all map points.
   **/
  @ApiModelProperty(value = "A number between 0 and 100 that denotes the pace/speed between the slowest and fastest instantaneous pace for the overall route. Slowest segment in the route (highest pace, lowest speed) is 0 and fastest segment (lowest pace, highest speed) is 100. Only makes sense in the context of the set of all map points.")
  @JsonProperty("scaledPace")
  public Integer getScaledPace() {
    return scaledPace;
  }
  public void setScaledPace(Integer scaledPace) {
    this.scaledPace = scaledPace;
  }

  
  /**
   * The speed
   **/
  @ApiModelProperty(value = "The speed")
  @JsonProperty("speed")
  public Integer getSpeed() {
    return speed;
  }
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }

  
  /**
   * The GPS location for this map point
   **/
  @ApiModelProperty(value = "The GPS location for this map point")
  @JsonProperty("location")
  public GPSPoint getLocation() {
    return location;
  }
  public void setLocation(GPSPoint location) {
    this.location = location;
  }

  
  /**
   * A value indicating whether or not this map point occurred during paused time
   **/
  @ApiModelProperty(value = "A value indicating whether or not this map point occurred during paused time")
  @JsonProperty("isPaused")
  public Boolean getIsPaused() {
    return isPaused;
  }
  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }

  
  /**
   * A value indicating whether or not this map point is the first one since the activity resumed
   **/
  @ApiModelProperty(value = "A value indicating whether or not this map point is the first one since the activity resumed")
  @JsonProperty("isResume")
  public Boolean getIsResume() {
    return isResume;
  }
  public void setIsResume(Boolean isResume) {
    this.isResume = isResume;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapPoint {\n");
    
    sb.append("    secondsSinceStart: ").append(StringUtil.toIndentedString(secondsSinceStart)).append("\n");
    sb.append("    mapPointType: ").append(StringUtil.toIndentedString(mapPointType)).append("\n");
    sb.append("    ordinal: ").append(StringUtil.toIndentedString(ordinal)).append("\n");
    sb.append("    actualDistance: ").append(StringUtil.toIndentedString(actualDistance)).append("\n");
    sb.append("    totalDistance: ").append(StringUtil.toIndentedString(totalDistance)).append("\n");
    sb.append("    heartRate: ").append(StringUtil.toIndentedString(heartRate)).append("\n");
    sb.append("    pace: ").append(StringUtil.toIndentedString(pace)).append("\n");
    sb.append("    scaledPace: ").append(StringUtil.toIndentedString(scaledPace)).append("\n");
    sb.append("    speed: ").append(StringUtil.toIndentedString(speed)).append("\n");
    sb.append("    location: ").append(StringUtil.toIndentedString(location)).append("\n");
    sb.append("    isPaused: ").append(StringUtil.toIndentedString(isPaused)).append("\n");
    sb.append("    isResume: ").append(StringUtil.toIndentedString(isResume)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
