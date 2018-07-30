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
