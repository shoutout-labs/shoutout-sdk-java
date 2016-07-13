package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Response;
import io.swagger.client.model.ActivityRecord;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * 
     *
     * Create an activity for an event
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createActivityTest() throws ApiException {
        ActivityRecord activityRecord = null;
        String authorization = null;
        // Response response = api.createActivity(activityRecord, authorization);

        // TODO: test validations
    }
    
}
