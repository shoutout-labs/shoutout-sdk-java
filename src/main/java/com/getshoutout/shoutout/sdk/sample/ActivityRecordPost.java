package com.getshoutout.shoutout.sdk.sample;

import com.getshoutout.shoutout.sdk.ApiClient;
import com.getshoutout.shoutout.sdk.Configuration;
import com.getshoutout.shoutout.sdk.api.ActivitiesApi;
import com.getshoutout.shoutout.sdk.auth.ApiKeyAuth;
import com.getshoutout.shoutout.sdk.model.ActivityRecord;
import com.getshoutout.shoutout.sdk.model.Response;

/**
 * Created by Madura on 14/07/2016.
 */
public class ActivityRecordPost {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure API key authorization: ShoutOUTCustomAuthorizer
        ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
        ShoutOUTCustomAuthorizer.setApiKeyPrefix("Apikey");
        ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");//Set Api Token

        try {
            ActivitiesApi api = new ActivitiesApi();
            ActivityRecord activityRecord = new ActivityRecord();
            activityRecord.setActivityId("ACTIVITY_ID");
            activityRecord.setActivityName("ACTIVITY_NAME");
            activityRecord.setUserId("USER_ID");//your userId
            activityRecord.setActivityData(new ActivityData("signup","John"));
            Response response = api.createActivity(activityRecord,ShoutOUTCustomAuthorizer.getApiKey());
            //Do your stuff with the response
            System.out.println("Message:"+response.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Arbitrary object based on the attributes in the event you created
    public static class ActivityData {
        private String status,name;//arbitrary properties

        public ActivityData(String status, String name) {
            this.status = status;
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
