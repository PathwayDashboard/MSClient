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
