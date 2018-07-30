package ms.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * ActivitySegment class for Golf Hole
 **/
@ApiModel(description = "ActivitySegment class for Golf Hole")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class GolfHoleSegment   {
  
  private Integer holeNumber = null;
  private Integer stepCount = null;
  private Integer distanceWalked = null;
  private Long segmentId = null;
  private Date startTime = null;
  private Date endTime = null;
  private String duration = null;
  private HeartRateSummary heartRateSummary = null;
  private CaloriesBurnedSummary caloriesBurnedSummary = null;

public enum SegmentTypeEnum {
  UNKNOWN("Unknown"), RUN("Run"), FREEPLAY("FreePlay"), DOZE("Doze"), SLEEP("Sleep"), SNOOZE("Snooze"), AWAKE("Awake"), GUIDEDWORKOUT("GuidedWorkout"), BIKE("Bike"), PAUSE("Pause"), RESUME("Resume"), DISTANCEBASEDINTERVAL("DistanceBasedInterval"), TIMEBASEDINTERVAL("TimeBasedInterval"), GOLFHOLE("GolfHole"), GOLFSHOT("GolfShot"), NOTWORN("NotWorn");

  private String value;

  SegmentTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private SegmentTypeEnum segmentType = null;

  
  /**
   * The hole number on the golf course
   **/
  @ApiModelProperty(value = "The hole number on the golf course")
  @JsonProperty("holeNumber")
  public Integer getHoleNumber() {
    return holeNumber;
  }
  public void setHoleNumber(Integer holeNumber) {
    this.holeNumber = holeNumber;
  }

  
  /**
   * The steps taken by the user for the hole
   **/
  @ApiModelProperty(value = "The steps taken by the user for the hole")
  @JsonProperty("stepCount")
  public Integer getStepCount() {
    return stepCount;
  }
  public void setStepCount(Integer stepCount) {
    this.stepCount = stepCount;
  }

  
  /**
   * The distance walked by the user for the hole
   **/
  @ApiModelProperty(value = "The distance walked by the user for the hole")
  @JsonProperty("distanceWalked")
  public Integer getDistanceWalked() {
    return distanceWalked;
  }
  public void setDistanceWalked(Integer distanceWalked) {
    this.distanceWalked = distanceWalked;
  }

  
  /**
   * The unique identifier of the segment
   **/
  @ApiModelProperty(value = "The unique identifier of the segment")
  @JsonProperty("segmentId")
  public Long getSegmentId() {
    return segmentId;
  }
  public void setSegmentId(Long segmentId) {
    this.segmentId = segmentId;
  }

  
  /**
   * The ISO 8601 formatted start time of the segment
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted start time of the segment")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The ISO 8601 formatted end time of the segment
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted end time of the segment")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The ISO 8601 formatted duration of the segment
   **/
  @ApiModelProperty(value = "The ISO 8601 formatted duration of the segment")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  
  /**
   * The heart rate summary for the segment
   **/
  @ApiModelProperty(value = "The heart rate summary for the segment")
  @JsonProperty("heartRateSummary")
  public HeartRateSummary getHeartRateSummary() {
    return heartRateSummary;
  }
  public void setHeartRateSummary(HeartRateSummary heartRateSummary) {
    this.heartRateSummary = heartRateSummary;
  }

  
  /**
   * The summary of calories burned during the segment
   **/
  @ApiModelProperty(value = "The summary of calories burned during the segment")
  @JsonProperty("caloriesBurnedSummary")
  public CaloriesBurnedSummary getCaloriesBurnedSummary() {
    return caloriesBurnedSummary;
  }
  public void setCaloriesBurnedSummary(CaloriesBurnedSummary caloriesBurnedSummary) {
    this.caloriesBurnedSummary = caloriesBurnedSummary;
  }

  
  /**
   * The segment type
   **/
  @ApiModelProperty(value = "The segment type")
  @JsonProperty("segmentType")
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GolfHoleSegment {\n");
    
    sb.append("    holeNumber: ").append(StringUtil.toIndentedString(holeNumber)).append("\n");
    sb.append("    stepCount: ").append(StringUtil.toIndentedString(stepCount)).append("\n");
    sb.append("    distanceWalked: ").append(StringUtil.toIndentedString(distanceWalked)).append("\n");
    sb.append("    segmentId: ").append(StringUtil.toIndentedString(segmentId)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    heartRateSummary: ").append(StringUtil.toIndentedString(heartRateSummary)).append("\n");
    sb.append("    caloriesBurnedSummary: ").append(StringUtil.toIndentedString(caloriesBurnedSummary)).append("\n");
    sb.append("    segmentType: ").append(StringUtil.toIndentedString(segmentType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
