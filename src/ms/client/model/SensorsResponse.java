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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * Represents the response for sensor data
 **/
@ApiModel(description = "Represents the response for sensor data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class SensorsResponse   {
  
  private Date startTime = null;
  private Date endTime = null;
  private String deviceId = null;
  private List<StepSensor> steps = new ArrayList<StepSensor>();
  private List<HeartRateSensor> heartRates = new ArrayList<HeartRateSensor>();
  private String nextPage = null;
  private Integer itemCount = null;

  
  /**
   * The ISO 8601 formatted start time
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted start time")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The ISO 8601 formatted end time
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted end time")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The unique identifier of the device
   **/
  @ApiModelProperty(value = "The unique identifier of the device")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   * The collection of steps sensor data
   **/
  @ApiModelProperty(value = "The collection of steps sensor data")
  @JsonProperty("steps")
  public List<StepSensor> getSteps() {
    return steps;
  }
  public void setSteps(List<StepSensor> steps) {
    this.steps = steps;
  }

  
  /**
   * The collection of heart rates sensor data
   **/
  @ApiModelProperty(value = "The collection of heart rates sensor data")
  @JsonProperty("heartRates")
  public List<HeartRateSensor> getHeartRates() {
    return heartRates;
  }
  public void setHeartRates(List<HeartRateSensor> heartRates) {
    this.heartRates = heartRates;
  }

  
  /**
   * The URI for the next page of data
   **/
  @ApiModelProperty(value = "The URI for the next page of data")
  @JsonProperty("nextPage")
  public String getNextPage() {
    return nextPage;
  }
  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  
  /**
   * The number of items returned
   **/
  @ApiModelProperty(value = "The number of items returned")
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorsResponse {\n");
    
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    deviceId: ").append(StringUtil.toIndentedString(deviceId)).append("\n");
    sb.append("    steps: ").append(StringUtil.toIndentedString(steps)).append("\n");
    sb.append("    heartRates: ").append(StringUtil.toIndentedString(heartRates)).append("\n");
    sb.append("    nextPage: ").append(StringUtil.toIndentedString(nextPage)).append("\n");
    sb.append("    itemCount: ").append(StringUtil.toIndentedString(itemCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
