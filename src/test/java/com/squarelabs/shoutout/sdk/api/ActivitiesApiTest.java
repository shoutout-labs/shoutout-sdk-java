package com.squarelabs.shoutout.sdk.api;

import com.squarelabs.shoutout.sdk.ApiException;
import com.squarelabs.shoutout.sdk.model.ActivityRecord;
import org.junit.Test;

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
