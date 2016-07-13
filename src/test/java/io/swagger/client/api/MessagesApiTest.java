package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Response;
import io.swagger.client.model.Message;
import io.swagger.client.model.MessageResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();

    
    /**
     * 
     *
     * Send a direct message
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String authorization = null;
        Message message = null;
        // MessageResponse response = api.sendMessage(authorization, message);

        // TODO: test validations
    }
    
}
