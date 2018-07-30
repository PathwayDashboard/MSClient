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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ms.client.ApiClient;
import ms.client.ApiException;
import ms.client.Configuration;
import ms.client.Pair;
import ms.client.TypeRef;
import ms.client.model.SummaryResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class SummariesApi {
  private ApiClient apiClient;

  public SummariesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SummariesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get the summary data for this user by date range
   * 
   * @param period The time period for each summary.
   * @param startTime The ISO 8601 formatted start time of the summaries, inclusive.
   * @param endTime The ISO 8601 formatted end time of the summaries, exclusive.  Defaults to the current time in UTC.
   * @param deviceIds The comma-separated list of device ids that generated the data.  Defaults to the aggregation of all devices.  Only a single device id is allowed for Developer Preview.
   * @param maxPageSize The maximum number of entries to return per page.  Defaults to 48 for hourly and 31 for daily.
   * @return SummaryResponse
   */
  public SummaryResponse summariesGet (String period, Date startTime, Date endTime, String deviceIds, Integer maxPageSize) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'period' is set
     if (period == null) {
        throw new ApiException(400, "Missing the required parameter 'period' when calling summariesGet");
     }
     
    // create path and map variables
    String path = "/v1/me/Summaries/{period}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "period" + "\\}", apiClient.escapeString(period.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceIds", deviceIds));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxPageSize", maxPageSize));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<SummaryResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
