package ms.client.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ms.client.StringUtil;


/**
 * The Device Profile Information
 **/
@ApiModel(description = "The Device Profile Information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class DeviceProfile   {
  
  private String id = null;
  private String displayName = null;
  private Date lastSuccessfulSync = null;

public enum DeviceFamilyEnum {
  UNKNOWN("Unknown"), BAND("Band"), WINDOWS("Windows"), ANDROID("Android"), IOS("IOS");

  private String value;

  DeviceFamilyEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private DeviceFamilyEnum deviceFamily = null;
  private String hardwareVersion = null;
  private String softwareVersion = null;
  private String modelName = null;
  private String manufacturer = null;

public enum DeviceStatusEnum {
  UNKNOWN("Unknown"), ACTIVE("Active"), INACTIVE("Inactive");

  private String value;

  DeviceStatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private DeviceStatusEnum deviceStatus = null;
  private Date createdDate = null;

  
  /**
   * The unique identifier of the device
   **/
  @ApiModelProperty(value = "The unique identifier of the device")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The name the user has given the device.  (Not available in the Developer Preview)
   **/
  @ApiModelProperty(value = "The name the user has given the device.  (Not available in the Developer Preview)")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The date the device was last synced with the service.  (Not available in the Developer Preview)
   **/
  @ApiModelProperty(value = "The date the device was last synced with the service.  (Not available in the Developer Preview)")
  @JsonProperty("lastSuccessfulSync")
  public Date getLastSuccessfulSync() {
    return lastSuccessfulSync;
  }
  public void setLastSuccessfulSync(Date lastSuccessfulSync) {
    this.lastSuccessfulSync = lastSuccessfulSync;
  }

  
  /**
   * The device family
   **/
  @ApiModelProperty(value = "The device family")
  @JsonProperty("deviceFamily")
  public DeviceFamilyEnum getDeviceFamily() {
    return deviceFamily;
  }
  public void setDeviceFamily(DeviceFamilyEnum deviceFamily) {
    this.deviceFamily = deviceFamily;
  }

  
  /**
   * The device version
   **/
  @ApiModelProperty(value = "The device version")
  @JsonProperty("hardwareVersion")
  public String getHardwareVersion() {
    return hardwareVersion;
  }
  public void setHardwareVersion(String hardwareVersion) {
    this.hardwareVersion = hardwareVersion;
  }

  
  /**
   * The device's software version
   **/
  @ApiModelProperty(value = "The device's software version")
  @JsonProperty("softwareVersion")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  
  /**
   * The name of the model of the device
   **/
  @ApiModelProperty(value = "The name of the model of the device")
  @JsonProperty("modelName")
  public String getModelName() {
    return modelName;
  }
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  
  /**
   * The name of the manufacturer of the device
   **/
  @ApiModelProperty(value = "The name of the manufacturer of the device")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The current status of the device
   **/
  @ApiModelProperty(value = "The current status of the device")
  @JsonProperty("deviceStatus")
  public DeviceStatusEnum getDeviceStatus() {
    return deviceStatus;
  }
  public void setDeviceStatus(DeviceStatusEnum deviceStatus) {
    this.deviceStatus = deviceStatus;
  }

  
  /**
   * The date the device was first registered  (Not available in the Developer Preview)
   **/
  @ApiModelProperty(value = "The date the device was first registered  (Not available in the Developer Preview)")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfile {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    lastSuccessfulSync: ").append(StringUtil.toIndentedString(lastSuccessfulSync)).append("\n");
    sb.append("    deviceFamily: ").append(StringUtil.toIndentedString(deviceFamily)).append("\n");
    sb.append("    hardwareVersion: ").append(StringUtil.toIndentedString(hardwareVersion)).append("\n");
    sb.append("    softwareVersion: ").append(StringUtil.toIndentedString(softwareVersion)).append("\n");
    sb.append("    modelName: ").append(StringUtil.toIndentedString(modelName)).append("\n");
    sb.append("    manufacturer: ").append(StringUtil.toIndentedString(manufacturer)).append("\n");
    sb.append("    deviceStatus: ").append(StringUtil.toIndentedString(deviceStatus)).append("\n");
    sb.append("    createdDate: ").append(StringUtil.toIndentedString(createdDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
