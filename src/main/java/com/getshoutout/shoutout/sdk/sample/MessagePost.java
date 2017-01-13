package com.getshoutout.shoutout.sdk.sample;


import com.getshoutout.shoutout.sdk.ApiClient;
import com.getshoutout.shoutout.sdk.Configuration;
import com.getshoutout.shoutout.sdk.auth.ApiKeyAuth;
import com.getshoutout.shoutout.sdk.model.Message;
import com.getshoutout.shoutout.sdk.model.MessageContent;
import com.getshoutout.shoutout.sdk.model.MessageResponse;
import com.getshoutout.shoutout.sdk.api.MessagesApi;

import java.util.Arrays;

/**
 * Created by Madura on 14/07/2016.
 */
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
            message.setDestinations(Arrays.asList("94771234567"));//mobile numbers to send the message
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
