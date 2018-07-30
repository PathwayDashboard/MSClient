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
 * Summary of the Performance Metrics for an Exercise
 **/
@ApiModel(description = "Summary of the Performance Metrics for an Exercise")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class PerformanceSummary   {
  
  private Integer finishHeartRate = null;
  private Integer recoveryHeartRateAt1Minute = null;
  private Integer recoveryHeartRateAt2Minutes = null;
  private HeartRateZones heartRateZones = null;

  
  /**
   * The heart rate when the user finished the exercise
   **/
  @ApiModelProperty(value = "The heart rate when the user finished the exercise")
  @JsonProperty("finishHeartRate")
  public Integer getFinishHeartRate() {
    return finishHeartRate;
  }
  public void setFinishHeartRate(Integer finishHeartRate) {
    this.finishHeartRate = finishHeartRate;
  }

  
  /**
   * The heart rate one minute after the user finished the exercise
   **/
  @ApiModelProperty(value = "The heart rate one minute after the user finished the exercise")
  @JsonProperty("recoveryHeartRateAt1Minute")
  public Integer getRecoveryHeartRateAt1Minute() {
    return recoveryHeartRateAt1Minute;
  }
  public void setRecoveryHeartRateAt1Minute(Integer recoveryHeartRateAt1Minute) {
    this.recoveryHeartRateAt1Minute = recoveryHeartRateAt1Minute;
  }

  
  /**
   * The heart rate two minutes after the user finished the exercise
   **/
  @ApiModelProperty(value = "The heart rate two minutes after the user finished the exercise")
  @JsonProperty("recoveryHeartRateAt2Minutes")
  public Integer getRecoveryHeartRateAt2Minutes() {
    return recoveryHeartRateAt2Minutes;
  }
  public void setRecoveryHeartRateAt2Minutes(Integer recoveryHeartRateAt2Minutes) {
    this.recoveryHeartRateAt2Minutes = recoveryHeartRateAt2Minutes;
  }

  
  /**
   * The breakdown of the heart rate zones during the exercise
   **/
  @ApiModelProperty(value = "The breakdown of the heart rate zones during the exercise")
  @JsonProperty("heartRateZones")
  public HeartRateZones getHeartRateZones() {
    return heartRateZones;
  }
  public void setHeartRateZones(HeartRateZones heartRateZones) {
    this.heartRateZones = heartRateZones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformanceSummary {\n");
    
    sb.append("    finishHeartRate: ").append(StringUtil.toIndentedString(finishHeartRate)).append("\n");
    sb.append("    recoveryHeartRateAt1Minute: ").append(StringUtil.toIndentedString(recoveryHeartRateAt1Minute)).append("\n");
    sb.append("    recoveryHeartRateAt2Minutes: ").append(StringUtil.toIndentedString(recoveryHeartRateAt2Minutes)).append("\n");
    sb.append("    heartRateZones: ").append(StringUtil.toIndentedString(heartRateZones)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
