package ms.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * The heart rate sensor data.
 **/
@ApiModel(description = "The heart rate sensor data.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class HeartRateSensor   {
  
  private Integer heartRate = null;
  private Integer quality = null;
  private Date timestamp = null;
  private String duration = null;

  
  /**
   * The heart rate reading
   **/
  @ApiModelProperty(value = "The heart rate reading")
  @JsonProperty("heartRate")
  public Integer getHeartRate() {
    return heartRate;
  }
  public void setHeartRate(Integer heartRate) {
    this.heartRate = heartRate;
  }

  
  /**
   * The quality of the heart rate reading
   **/
  @ApiModelProperty(value = "The quality of the heart rate reading")
  @JsonProperty("quality")
  public Integer getQuality() {
    return quality;
  }
  public void setQuality(Integer quality) {
    this.quality = quality;
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
    sb.append("class HeartRateSensor {\n");
    
    sb.append("    heartRate: ").append(StringUtil.toIndentedString(heartRate)).append("\n");
    sb.append("    quality: ").append(StringUtil.toIndentedString(quality)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
