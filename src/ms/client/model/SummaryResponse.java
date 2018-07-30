package ms.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * The summary response.
 **/
@ApiModel(description = "The summary response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class SummaryResponse   {
  
  private List<Summary> summaries = new ArrayList<Summary>();
  private String nextPage = null;
  private Integer itemCount = null;

  
  /**
   * The collection of summaries
   **/
  @ApiModelProperty(value = "The collection of summaries")
  @JsonProperty("summaries")
  public List<Summary> getSummaries() {
    return summaries;
  }
  public void setSummaries(List<Summary> summaries) {
    this.summaries = summaries;
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
    sb.append("class SummaryResponse {\n");
    
    sb.append("    summaries: ").append(StringUtil.toIndentedString(summaries)).append("\n");
    sb.append("    nextPage: ").append(StringUtil.toIndentedString(nextPage)).append("\n");
    sb.append("    itemCount: ").append(StringUtil.toIndentedString(itemCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
