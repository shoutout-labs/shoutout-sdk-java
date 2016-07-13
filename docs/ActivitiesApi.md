# ActivitiesApi

All URIs are relative to *https://amdimbh5tf.execute-api.us-east-1.amazonaws.com/v7*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActivity**](ActivitiesApi.md#createActivity) | **POST** /activities/records | 


<a name="createActivity"></a>
# **createActivity**
> Response createActivity(activityRecord, authorization)



Create an activity for an event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

ActivitiesApi apiInstance = new ActivitiesApi();
ActivityRecord activityRecord = new ActivityRecord(); // ActivityRecord | 
String authorization = "authorization_example"; // String | 
try {
    Response result = apiInstance.createActivity(activityRecord, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#createActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityRecord** | [**ActivityRecord**](ActivityRecord.md)|  |
 **authorization** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

