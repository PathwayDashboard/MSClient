package ms.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * Defines the class for sensors that measure steps.
 **/
@ApiModel(description = "Defines the class for sensors that measure steps.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class StepSensor   {
  
  private Integer steps = null;
  private Date timestamp = null;
  private String duration = null;

  
  /**
   * The Steps reading from a device like a pedometer
   **/
  @ApiModelProperty(value = "The Steps reading from a device like a pedometer")
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }
  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  
  /**
   * The timestamp for the sensor reading
   **/
  @ApiModelProperty(value = "The timestamp for the sensor reading")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepSensor {\n");
    
    sb.append("    steps: ").append(StringUtil.toIndentedString(steps)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
