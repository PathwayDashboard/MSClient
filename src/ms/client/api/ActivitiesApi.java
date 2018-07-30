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
import ms.client.model.ActivitiesResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:59:19.861+01:00")
public class ActivitiesApi {
  private ApiClient apiClient;

  public ActivitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActivitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a collection of activities
   * 
   * @param activityIds The comma-separated list of activity ids to return.  Defaults to all activities.
   * @param activityTypes The comma-separated list of activity types to return.  Defaults to all activity types.
   * @param activityIncludes The comma-separated list of additional properties to return: Details, MinuteSummaries, MapPoints.  Defaults to none.
   * @param deviceIds Filters the set of returned activities based on the comma-separated list of device ids provided.  Defaults to no filter.
   * @param startTime Filters the set of returned activities to those starting after the specified ISO 8601 formatted start time, inclusive.
   * @param endTime Filters the set of returned activities to those starting before the specified ISO 8601 formatted end time, exclusive.  Defaults to the current time in UTC.
   * @param splitDistanceType The length of splits used in each activity.  Defaults to Mile.
   * @param maxPageSize The maximum number of entries to return per page. Defaults to 1000.
   * @return ActivitiesResponse
   */
  public ActivitiesResponse activitiesGet (String activityIds, String activityTypes, String activityIncludes, String deviceIds, Date startTime, Date endTime, String splitDistanceType, Integer maxPageSize) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/v1/me/Activities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "activityIds", activityIds));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activityTypes", activityTypes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "activityIncludes", activityIncludes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceIds", deviceIds));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "splitDistanceType", splitDistanceType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maxPageSize", maxPageSize));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<ActivitiesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get the details of an activity by activity id.
   * 
   * @param activityId The id of the activity to get.
   * @param activityIncludes The comma-separated list of additional properties to return: Details, MinuteSummaries, MapPoints.  Defaults to none.
   * @return ActivitiesResponse
   */
  public ActivitiesResponse activitiesGetById (String activityId, String activityIncludes) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'activityId' is set
     if (activityId == null) {
        throw new ApiException(400, "Missing the required parameter 'activityId' when calling activitiesGetById");
     }
     
    // create path and map variables
    String path = "/v1/me/Activities/{activityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "activityId" + "\\}", apiClient.escapeString(activityId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "activityIncludes", activityIncludes));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<ActivitiesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
