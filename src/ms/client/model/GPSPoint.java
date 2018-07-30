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

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * GPS Point sensor
 **/
@ApiModel(description = "GPS Point sensor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class GPSPoint   {
  
  private Integer speedOverGround = null;
  private Integer latitude = null;
  private Integer longitude = null;
  private Integer elevationFromMeanSeaLevel = null;
  private Integer estimatedHorizontalError = null;
  private Integer estimatedVerticalError = null;

  
  /**
   * The speed over ground for the GPS point in m/s * 100
   **/
  @ApiModelProperty(value = "The speed over ground for the GPS point in m/s * 100")
  @JsonProperty("speedOverGround")
  public Integer getSpeedOverGround() {
    return speedOverGround;
  }
  public void setSpeedOverGround(Integer speedOverGround) {
    this.speedOverGround = speedOverGround;
  }

  
  /**
   * The latitude for the GPS point in degrees * 10^7 (+ = North)
   **/
  @ApiModelProperty(value = "The latitude for the GPS point in degrees * 10^7 (+ = North)")
  @JsonProperty("latitude")
  public Integer getLatitude() {
    return latitude;
  }
  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  
  /**
   * The longitude for the GPS point in degrees * 10^7 (+ = East)
   **/
  @ApiModelProperty(value = "The longitude for the GPS point in degrees * 10^7 (+ = East)")
  @JsonProperty("longitude")
  public Integer getLongitude() {
    return longitude;
  }
  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  
  /**
   * The elevation from mean sea level in m * 100
   **/
  @ApiModelProperty(value = "The elevation from mean sea level in m * 100")
  @JsonProperty("elevationFromMeanSeaLevel")
  public Integer getElevationFromMeanSeaLevel() {
    return elevationFromMeanSeaLevel;
  }
  public void setElevationFromMeanSeaLevel(Integer elevationFromMeanSeaLevel) {
    this.elevationFromMeanSeaLevel = elevationFromMeanSeaLevel;
  }

  
  /**
   * The estimated horizontal error in m * 100
   **/
  @ApiModelProperty(value = "The estimated horizontal error in m * 100")
  @JsonProperty("estimatedHorizontalError")
  public Integer getEstimatedHorizontalError() {
    return estimatedHorizontalError;
  }
  public void setEstimatedHorizontalError(Integer estimatedHorizontalError) {
    this.estimatedHorizontalError = estimatedHorizontalError;
  }

  
  /**
   * The estimated vertical error in m * 100
   **/
  @ApiModelProperty(value = "The estimated vertical error in m * 100")
  @JsonProperty("estimatedVerticalError")
  public Integer getEstimatedVerticalError() {
    return estimatedVerticalError;
  }
  public void setEstimatedVerticalError(Integer estimatedVerticalError) {
    this.estimatedVerticalError = estimatedVerticalError;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPSPoint {\n");
    
    sb.append("    speedOverGround: ").append(StringUtil.toIndentedString(speedOverGround)).append("\n");
    sb.append("    latitude: ").append(StringUtil.toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(StringUtil.toIndentedString(longitude)).append("\n");
    sb.append("    elevationFromMeanSeaLevel: ").append(StringUtil.toIndentedString(elevationFromMeanSeaLevel)).append("\n");
    sb.append("    estimatedHorizontalError: ").append(StringUtil.toIndentedString(estimatedHorizontalError)).append("\n");
    sb.append("    estimatedVerticalError: ").append(StringUtil.toIndentedString(estimatedVerticalError)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
