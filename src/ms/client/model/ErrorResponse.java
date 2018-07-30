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


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class ErrorResponse   {
  
  private ErrorInformation error = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public ErrorInformation getError() {
    return error;
  }
  public void setError(ErrorInformation error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    error: ").append(StringUtil.toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
