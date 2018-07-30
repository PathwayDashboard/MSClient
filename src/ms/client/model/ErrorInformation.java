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


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class ErrorInformation   {
  
  private String code = null;
  private String message = null;
  private String target = null;
  private List<ErrorInformation> details = new ArrayList<ErrorInformation>();
  private ErrorInformation innererror = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public List<ErrorInformation> getDetails() {
    return details;
  }
  public void setDetails(List<ErrorInformation> details) {
    this.details = details;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("innererror")
  public ErrorInformation getInnererror() {
    return innererror;
  }
  public void setInnererror(ErrorInformation innererror) {
    this.innererror = innererror;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInformation {\n");
    
    sb.append("    code: ").append(StringUtil.toIndentedString(code)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    target: ").append(StringUtil.toIndentedString(target)).append("\n");
    sb.append("    details: ").append(StringUtil.toIndentedString(details)).append("\n");
    sb.append("    innererror: ").append(StringUtil.toIndentedString(innererror)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
