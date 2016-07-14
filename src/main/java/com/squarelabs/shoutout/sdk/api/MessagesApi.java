package com.squarelabs.shoutout.sdk.api;

import com.squarelabs.shoutout.sdk.ApiClient;
import com.squarelabs.shoutout.sdk.Configuration;
import com.squarelabs.shoutout.sdk.Pair;
import com.squarelabs.shoutout.sdk.model.Message;
import com.squarelabs.shoutout.sdk.ApiException;
import com.squarelabs.shoutout.sdk.model.MessageResponse;
import com.sun.jersey.api.client.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class MessagesApi {
  private ApiClient apiClient;

  public MessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Send a direct message
   * @param authorization  (required)
   * @param message  (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   */
  public MessageResponse sendMessage(String authorization, Message message) throws ApiException {
    Object localVarPostBody = message;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling sendMessage");
    }
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling sendMessage");
    }
    
    // create path and map variables
    String localVarPath = "/messages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ShoutOUTCustomAuthorizer" };

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
