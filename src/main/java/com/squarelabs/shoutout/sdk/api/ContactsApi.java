package com.squarelabs.shoutout.sdk.api;

import com.squarelabs.shoutout.sdk.ApiException;
import com.squarelabs.shoutout.sdk.Configuration;
import com.squarelabs.shoutout.sdk.model.Contact;
import com.squarelabs.shoutout.sdk.model.ContactList;
import com.sun.jersey.api.client.GenericType;

import com.squarelabs.shoutout.sdk.ApiClient;
import com.squarelabs.shoutout.sdk.Pair;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class ContactsApi {
  private ApiClient apiClient;

  public ContactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContactsApi(ApiClient apiClient) {
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
   * Create contact or replace if exists
   * @param authorization  (required)
   * @param contact  (required)
   * @throws ApiException if fails to make API call
   */
  public void createOrReplaceContact(String authorization, Object contact) throws ApiException {
    Object localVarPostBody = contact;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createOrReplaceContact");
    }
    
    // verify the required parameter 'contact' is set
    if (contact == null) {
      throw new ApiException(400, "Missing the required parameter 'contact' when calling createOrReplaceContact");
    }
    
    // create path and map variables
    String localVarPath = "/contacts".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Create contact list or replace if exists
   * @param authorization  (required)
   * @param contactList  (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ContactList createOrReplaceContactList(String authorization, ContactList contactList) throws ApiException {
    Object localVarPostBody = contactList;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createOrReplaceContactList");
    }
    
    // verify the required parameter 'contactList' is set
    if (contactList == null) {
      throw new ApiException(400, "Missing the required parameter 'contactList' when calling createOrReplaceContactList");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/list".replaceAll("\\{format\\}","json");

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

    GenericType<ContactList> localVarReturnType = new GenericType<ContactList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Create contact or update if exists
   * @param authorization  (required)
   * @param contact  (required)
   * @return Contact
   * @throws ApiException if fails to make API call
   */
  public Contact createOrUpdateContact(String authorization, Object contact) throws ApiException {
    Object localVarPostBody = contact;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createOrUpdateContact");
    }
    
    // verify the required parameter 'contact' is set
    if (contact == null) {
      throw new ApiException(400, "Missing the required parameter 'contact' when calling createOrUpdateContact");
    }
    
    // create path and map variables
    String localVarPath = "/contacts".replaceAll("\\{format\\}","json");

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

    GenericType<Contact> localVarReturnType = new GenericType<Contact>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Create contact list or update if exists
   * @param authorization  (required)
   * @param contactList  (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ContactList createOrUpdateContactList(String authorization, ContactList contactList) throws ApiException {
    Object localVarPostBody = contactList;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createOrUpdateContactList");
    }
    
    // verify the required parameter 'contactList' is set
    if (contactList == null) {
      throw new ApiException(400, "Missing the required parameter 'contactList' when calling createOrUpdateContactList");
    }
    
    // create path and map variables
    String localVarPath = "/contacts/list".replaceAll("\\{format\\}","json");

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

    GenericType<ContactList> localVarReturnType = new GenericType<ContactList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
