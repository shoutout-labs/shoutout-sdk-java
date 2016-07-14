package com.squarelabs.shoutout.sdk.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.squarelabs.shoutout.sdk.ApiClient;
import com.squarelabs.shoutout.sdk.Configuration;
import com.squarelabs.shoutout.sdk.api.ContactsApi;
import com.squarelabs.shoutout.sdk.auth.ApiKeyAuth;

/**
 * Created by Madura on 14/07/2016.
 */
public class ContatcsPut {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: ShoutOUTCustomAuthorizer
        ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
        ShoutOUTCustomAuthorizer.setApiKeyPrefix("Apikey");
        ShoutOUTCustomAuthorizer.setApiKey("YOUR_API_KEY");//Set Api Token
        try {
            ContactsApi api = new ContactsApi();

            //create contact object
            ObjectMapper mapper = new ObjectMapper();
            ObjectNode objectNode = mapper.createObjectNode();

            ObjectNode mobileNumber = mapper.createObjectNode();
            mobileNumber.put("s", "94778845712");
            objectNode.set("mobile_number", mobileNumber);

            ObjectNode name = mapper.createObjectNode();
            name.put("s", "John");
            objectNode.set("name", name);

            ObjectNode email = mapper.createObjectNode();
            email.put("s", "engmadura@yahoo.com");
            objectNode.set("email", email);

            System.out.println(objectNode.toString());

            api.createOrUpdateContact(ShoutOUTCustomAuthorizer.getApiKey(), objectNode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
