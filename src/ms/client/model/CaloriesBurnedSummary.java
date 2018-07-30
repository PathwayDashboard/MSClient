package ms.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * Calories Burned Summary Information
 **/
@ApiModel(description = "Calories Burned Summary Information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class CaloriesBurnedSummary   {
  

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
  private Integer totalCalories = null;

  
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
   * The total calories burned during the period
   **/
  @ApiModelProperty(value = "The total calories burned during the period")
  @JsonProperty("totalCalories")
  public Integer getTotalCalories() {
    return totalCalories;
  }
  public void setTotalCalories(Integer totalCalories) {
    this.totalCalories = totalCalories;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaloriesBurnedSummary {\n");
    
    sb.append("    period: ").append(StringUtil.toIndentedString(period)).append("\n");
    sb.append("    totalCalories: ").append(StringUtil.toIndentedString(totalCalories)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
