# MessagesApi

All URIs are relative to *https://amdimbh5tf.execute-api.us-east-1.amazonaws.com/v7*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | 


<a name="sendMessage"></a>
# **sendMessage**
> MessageResponse sendMessage(authorization, message)



Send a direct message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
String authorization = "authorization_example"; // String | 
Message message = new Message(); // Message | 
try {
    MessageResponse result = apiInstance.sendMessage(authorization, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **message** | [**Message**](Message.md)|  |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

