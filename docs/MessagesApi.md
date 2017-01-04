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
import com.shoutoutlabs.shoutout.sdk.ApiClient;
import com.shoutoutlabs.shoutout.sdk.Configuration;
import com.shoutoutlabs.shoutout.sdk.api.MessagesApi;
import com.shoutoutlabs.shoutout.sdk.auth.ApiKeyAuth;
import com.shoutoutlabs.shoutout.sdk.model.Message;
import com.shoutoutlabs.shoutout.sdk.model.MessageContent;
import com.shoutoutlabs.shoutout.sdk.model.MessageResponse;

import java.util.Arrays;

public class MessagePost {


    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: ShoutOUTCustomAuthorizer
        ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
        ShoutOUTCustomAuthorizer.setApiKeyPrefix("Apikey");
        ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");//Set Api Token

        try {
            MessagesApi api = new MessagesApi(defaultClient);
            Message message = new Message();
            MessageContent messageContent = new MessageContent();
            messageContent.setSms("Hello, This is a test message"); //sms content
            message.setContent(messageContent);
            message.setDestinations(Arrays.asList("94778845713"));//mobile numbers to send the message
            message.setSource("ShoutDEMO");//Sender Id
            message.setTransports(Arrays.asList(Message.TransportsEnum.SMS));//Type of transport (SMS). More transports will come soon

            MessageResponse response = api.sendMessage(message);
            //Do your stuff with the response
            System.out.println("Status:" + response.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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

