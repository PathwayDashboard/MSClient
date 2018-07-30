package ms.client.model;

import io.swagger.annotations.*;
import ms.client.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Distribution of Heart Rates through a range of values defined by Fitness experts \n            which determine the effectiveness of the exercise
 **/
@ApiModel(description = "Distribution of Heart Rates through a range of values defined by Fitness experts  which determine the effectiveness of the exercise")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class HeartRateZones   {
  
  private Integer underHealthyHeart = null;
  private Integer underAerobic = null;
  private Integer aerobic = null;
  private Integer anaerobic = null;
  private Integer fitnessZone = null;
  private Integer healthyHeart = null;
  private Integer redline = null;
  private Integer overRedline = null;

  
  /**
   * The number of minutes where the HR was below 50% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was below 50% of the user’s max HR")
  @JsonProperty("underHealthyHeart")
  public Integer getUnderHealthyHeart() {
    return underHealthyHeart;
  }
  public void setUnderHealthyHeart(Integer underHealthyHeart) {
    this.underHealthyHeart = underHealthyHeart;
  }

  
  /**
   * Note: this field is deprecated. The correct field name is now UnderHealthyHeart. Populated for backwards compatibility until V2\n            The number of minutes where the HR was below 50% of the user’s max HR
   **/
  @ApiModelProperty(value = "Note: this field is deprecated. The correct field name is now UnderHealthyHeart. Populated for backwards compatibility until V2 The number of minutes where the HR was below 50% of the user’s max HR")
  @JsonProperty("underAerobic")
  public Integer getUnderAerobic() {
    return underAerobic;
  }
  public void setUnderAerobic(Integer underAerobic) {
    this.underAerobic = underAerobic;
  }

  
  /**
   * The number of minutes where the HR was between 70-80% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was between 70-80% of the user’s max HR")
  @JsonProperty("aerobic")
  public Integer getAerobic() {
    return aerobic;
  }
  public void setAerobic(Integer aerobic) {
    this.aerobic = aerobic;
  }

  
  /**
   * The number of minutes where the HR was between 80-90% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was between 80-90% of the user’s max HR")
  @JsonProperty("anaerobic")
  public Integer getAnaerobic() {
    return anaerobic;
  }
  public void setAnaerobic(Integer anaerobic) {
    this.anaerobic = anaerobic;
  }

  
  /**
   * The number of minutes where the HR was between 60-70% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was between 60-70% of the user’s max HR")
  @JsonProperty("fitnessZone")
  public Integer getFitnessZone() {
    return fitnessZone;
  }
  public void setFitnessZone(Integer fitnessZone) {
    this.fitnessZone = fitnessZone;
  }

  
  /**
   * The number of minutes where the HR was between 50-60% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was between 50-60% of the user’s max HR")
  @JsonProperty("healthyHeart")
  public Integer getHealthyHeart() {
    return healthyHeart;
  }
  public void setHealthyHeart(Integer healthyHeart) {
    this.healthyHeart = healthyHeart;
  }

  
  /**
   * The number of minutes where the HR was between 90-100% of the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes where the HR was between 90-100% of the user’s max HR")
  @JsonProperty("redline")
  public Integer getRedline() {
    return redline;
  }
  public void setRedline(Integer redline) {
    this.redline = redline;
  }

  
  /**
   * The number of minutes above the user’s max HR
   **/
  @ApiModelProperty(value = "The number of minutes above the user’s max HR")
  @JsonProperty("overRedline")
  public Integer getOverRedline() {
    return overRedline;
  }
  public void setOverRedline(Integer overRedline) {
    this.overRedline = overRedline;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartRateZones {\n");
    
    sb.append("    underHealthyHeart: ").append(StringUtil.toIndentedString(underHealthyHeart)).append("\n");
    sb.append("    underAerobic: ").append(StringUtil.toIndentedString(underAerobic)).append("\n");
    sb.append("    aerobic: ").append(StringUtil.toIndentedString(aerobic)).append("\n");
    sb.append("    anaerobic: ").append(StringUtil.toIndentedString(anaerobic)).append("\n");
    sb.append("    fitnessZone: ").append(StringUtil.toIndentedString(fitnessZone)).append("\n");
    sb.append("    healthyHeart: ").append(StringUtil.toIndentedString(healthyHeart)).append("\n");
    sb.append("    redline: ").append(StringUtil.toIndentedString(redline)).append("\n");
    sb.append("    overRedline: ").append(StringUtil.toIndentedString(overRedline)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
