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
