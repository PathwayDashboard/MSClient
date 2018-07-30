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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * The activity collection response.
 **/
@ApiModel(description = "The activity collection response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class ActivitiesResponse   {
  
  private List<BikeActivity> bikeActivities = new ArrayList<BikeActivity>();
  private List<FreePlayActivity> freePlayActivities = new ArrayList<FreePlayActivity>();
  private List<GolfActivity> golfActivities = new ArrayList<GolfActivity>();
  private List<GuidedWorkoutActivity> guidedWorkoutActivities = new ArrayList<GuidedWorkoutActivity>();
  private List<RunActivity> runActivities = new ArrayList<RunActivity>();
  private List<SleepActivity> sleepActivities = new ArrayList<SleepActivity>();
  private String nextPage = null;
  private Integer itemCount = null;

  
  /**
   * The collection of bike activities
   **/
  @ApiModelProperty(value = "The collection of bike activities")
  @JsonProperty("bikeActivities")
  public List<BikeActivity> getBikeActivities() {
    return bikeActivities;
  }
  public void setBikeActivities(List<BikeActivity> bikeActivities) {
    this.bikeActivities = bikeActivities;
  }

  
  /**
   * The collection of free play activities
   **/
  @ApiModelProperty(value = "The collection of free play activities")
  @JsonProperty("freePlayActivities")
  public List<FreePlayActivity> getFreePlayActivities() {
    return freePlayActivities;
  }
  public void setFreePlayActivities(List<FreePlayActivity> freePlayActivities) {
    this.freePlayActivities = freePlayActivities;
  }

  
  /**
   * The collection of golf activities
   **/
  @ApiModelProperty(value = "The collection of golf activities")
  @JsonProperty("golfActivities")
  public List<GolfActivity> getGolfActivities() {
    return golfActivities;
  }
  public void setGolfActivities(List<GolfActivity> golfActivities) {
    this.golfActivities = golfActivities;
  }

  
  /**
   * The collection of guided workout activities
   **/
  @ApiModelProperty(value = "The collection of guided workout activities")
  @JsonProperty("guidedWorkoutActivities")
  public List<GuidedWorkoutActivity> getGuidedWorkoutActivities() {
    return guidedWorkoutActivities;
  }
  public void setGuidedWorkoutActivities(List<GuidedWorkoutActivity> guidedWorkoutActivities) {
    this.guidedWorkoutActivities = guidedWorkoutActivities;
  }

  
  /**
   * The collection of run activities
   **/
  @ApiModelProperty(value = "The collection of run activities")
  @JsonProperty("runActivities")
  public List<RunActivity> getRunActivities() {
    return runActivities;
  }
  public void setRunActivities(List<RunActivity> runActivities) {
    this.runActivities = runActivities;
  }

  
  /**
   * The collection of sleep activities
   **/
  @ApiModelProperty(value = "The collection of sleep activities")
  @JsonProperty("sleepActivities")
  public List<SleepActivity> getSleepActivities() {
    return sleepActivities;
  }
  public void setSleepActivities(List<SleepActivity> sleepActivities) {
    this.sleepActivities = sleepActivities;
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
    sb.append("class ActivitiesResponse {\n");
    
    sb.append("    bikeActivities: ").append(StringUtil.toIndentedString(bikeActivities)).append("\n");
    sb.append("    freePlayActivities: ").append(StringUtil.toIndentedString(freePlayActivities)).append("\n");
    sb.append("    golfActivities: ").append(StringUtil.toIndentedString(golfActivities)).append("\n");
    sb.append("    guidedWorkoutActivities: ").append(StringUtil.toIndentedString(guidedWorkoutActivities)).append("\n");
    sb.append("    runActivities: ").append(StringUtil.toIndentedString(runActivities)).append("\n");
    sb.append("    sleepActivities: ").append(StringUtil.toIndentedString(sleepActivities)).append("\n");
    sb.append("    nextPage: ").append(StringUtil.toIndentedString(nextPage)).append("\n");
    sb.append("    itemCount: ").append(StringUtil.toIndentedString(itemCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
