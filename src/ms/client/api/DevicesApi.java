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
package ms.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ms.client.ApiClient;
import ms.client.ApiException;
import ms.client.Configuration;
import ms.client.Pair;
import ms.client.TypeRef;
import ms.client.model.DeviceProfile;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get the details about the devices associated with this user&#39;s Microsoft Health profile.
   * 
   * @return List<DeviceProfile>
   */
  public List<DeviceProfile> devicesGet () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/v1/me/Devices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<DeviceProfile>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get the details about the requested device associated with this user&#39;s Microsoft Health profile.
   * 
   * @param deviceId The id of the device
   * @return DeviceProfile
   */
  public DeviceProfile deviceGet (String deviceId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling deviceGet");
     }
     
    // create path and map variables
    String path = "/v1/me/Devices/{deviceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<DeviceProfile>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
