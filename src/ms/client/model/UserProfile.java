package ms.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * Information about the User
 **/
@ApiModel(description = "Information about the User")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class UserProfile   {
  
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private Date birthdate = null;
  private String postalCode = null;
  private String gender = null;
  private Integer height = null;
  private Integer weight = null;
  private String preferredLocale = null;
  private Date lastUpdateTime = null;

  
  /**
   * The user's first name
   **/
  @ApiModelProperty(value = "The user's first name")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * The user's middle name
   **/
  @ApiModelProperty(value = "The user's middle name")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * The user's last name
   **/
  @ApiModelProperty(value = "The user's last name")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The user's birth date
   **/
  @ApiModelProperty(value = "The user's birth date")
  @JsonProperty("birthdate")
  public Date getBirthdate() {
    return birthdate;
  }
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  
  /**
   * The user's postal code
   **/
  @ApiModelProperty(value = "The user's postal code")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * The user's gender
   **/
  @ApiModelProperty(value = "The user's gender")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   * The user's current height
   **/
  @ApiModelProperty(value = "The user's current height")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  
  /**
   * The user's current weight
   **/
  @ApiModelProperty(value = "The user's current weight")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   * The user's preferred locale
   **/
  @ApiModelProperty(value = "The user's preferred locale")
  @JsonProperty("preferredLocale")
  public String getPreferredLocale() {
    return preferredLocale;
  }
  public void setPreferredLocale(String preferredLocale) {
    this.preferredLocale = preferredLocale;
  }

  
  /**
   * The last update time of the user's profile record
   **/
  @ApiModelProperty(value = "The last update time of the user's profile record")
  @JsonProperty("lastUpdateTime")
  public Date getLastUpdateTime() {
    return lastUpdateTime;
  }
  public void setLastUpdateTime(Date lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(StringUtil.toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    birthdate: ").append(StringUtil.toIndentedString(birthdate)).append("\n");
    sb.append("    postalCode: ").append(StringUtil.toIndentedString(postalCode)).append("\n");
    sb.append("    gender: ").append(StringUtil.toIndentedString(gender)).append("\n");
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(StringUtil.toIndentedString(weight)).append("\n");
    sb.append("    preferredLocale: ").append(StringUtil.toIndentedString(preferredLocale)).append("\n");
    sb.append("    lastUpdateTime: ").append(StringUtil.toIndentedString(lastUpdateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
