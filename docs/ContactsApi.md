# ContactsApi

All URIs are relative to *https://amdimbh5tf.execute-api.us-east-1.amazonaws.com/v7*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrReplaceContact**](ContactsApi.md#createOrReplaceContact) | **POST** /contacts | 
[**createOrReplaceContactList**](ContactsApi.md#createOrReplaceContactList) | **POST** /contacts/list | 
[**createOrUpdateContact**](ContactsApi.md#createOrUpdateContact) | **PUT** /contacts | 
[**createOrUpdateContactList**](ContactsApi.md#createOrUpdateContactList) | **PUT** /contacts/list | 


<a name="createOrReplaceContact"></a>
# **createOrReplaceContact**
> createOrReplaceContact(authorization, contact)



Create contact or replace if exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String authorization = "authorization_example"; // String | 
Contact contact = new Contact(); // Contact | 
try {
    apiInstance.createOrReplaceContact(authorization, contact);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createOrReplaceContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **contact** | [**Contact**](Contact.md)|  |

### Return type

null (empty response body)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrReplaceContactList"></a>
# **createOrReplaceContactList**
> ContactList createOrReplaceContactList(authorization, contactList)



Create contact list or replace if exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String authorization = "authorization_example"; // String | 
ContactList contactList = new ContactList(); // ContactList | 
try {
    ContactList result = apiInstance.createOrReplaceContactList(authorization, contactList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createOrReplaceContactList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **contactList** | [**ContactList**](ContactList.md)|  |

### Return type

[**ContactList**](ContactList.md)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateContact"></a>
# **createOrUpdateContact**
> Contact createOrUpdateContact(authorization, contact)



Create contact or update if exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String authorization = "authorization_example"; // String | 
Contact contact = new Contact(); // Contact | 
try {
    Contact result = apiInstance.createOrUpdateContact(authorization, contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createOrUpdateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **contact** | [**Contact**](Contact.md)|  |

### Return type

[**Contact**](Contact.md)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateContactList"></a>
# **createOrUpdateContactList**
> ContactList createOrUpdateContactList(authorization, contactList)



Create contact list or update if exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ShoutOUTCustomAuthorizer
ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

ContactsApi apiInstance = new ContactsApi();
String authorization = "authorization_example"; // String | 
ContactList contactList = new ContactList(); // ContactList | 
try {
    ContactList result = apiInstance.createOrUpdateContactList(authorization, contactList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createOrUpdateContactList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **contactList** | [**ContactList**](ContactList.md)|  |

### Return type

[**ContactList**](ContactList.md)

### Authorization

[ShoutOUTCustomAuthorizer](../README.md#ShoutOUTCustomAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

