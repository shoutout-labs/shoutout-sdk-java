package com.squarelabs.shoutout.sdk.sample;


import com.squarelabs.shoutout.sdk.ApiClient;
import com.squarelabs.shoutout.sdk.Configuration;
import com.squarelabs.shoutout.sdk.api.MessagesApi;
import com.squarelabs.shoutout.sdk.auth.ApiKeyAuth;
import com.squarelabs.shoutout.sdk.model.Message;
import com.squarelabs.shoutout.sdk.model.MessageContent;
import com.squarelabs.shoutout.sdk.model.MessageResponse;

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
            MessagesApi api = new MessagesApi();
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
