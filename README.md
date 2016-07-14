# ShoutOUT-Java-Sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.squaremobile.shoutout.sdk</groupId>
    <artifactId>shoutout-java-sdk</artifactId>
    <version>7.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.squaremobile.shoutout.sdk:shoutout-java-sdk:7.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/shoutout-java-sdk-7.0.0.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.squaremobile.shoutout.sdk.*;
import com.squaremobile.shoutout.sdk.auth.*;
import com.squaremobile.shoutout.sdk.model.*;
import com.squaremobile.shoutout.sdk.api.ActivitiesApi;

import java.io.File;
import java.util.*;

public class ActivitiesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: ShoutOUTCustomAuthorizer
        ApiKeyAuth ShoutOUTCustomAuthorizer = (ApiKeyAuth) defaultClient.getAuthentication("ShoutOUTCustomAuthorizer");
        ShoutOUTCustomAuthorizer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ShoutOUTCustomAuthorizer.setApiKeyPrefix("Token");

        ActivitiesApi apiInstance = new ActivitiesApi();
        ActivityRecord activityRecord = new ActivityRecord(); // ActivityRecord | 
        String authorization = "authorization_example"; // String | 
        try {
            Response result = apiInstance.createActivity(activityRecord, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitiesApi#createActivity");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://amdimbh5tf.execute-api.us-east-1.amazonaws.com/v7*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitiesApi* | [**createActivity**](docs/ActivitiesApi.md#createActivity) | **POST** /activities/records | 
*ContactsApi* | [**createOrReplaceContact**](docs/ContactsApi.md#createOrReplaceContact) | **POST** /contacts | 
*ContactsApi* | [**createOrReplaceContactList**](docs/ContactsApi.md#createOrReplaceContactList) | **POST** /contacts/list | 
*ContactsApi* | [**createOrUpdateContact**](docs/ContactsApi.md#createOrUpdateContact) | **PUT** /contacts | 
*ContactsApi* | [**createOrUpdateContactList**](docs/ContactsApi.md#createOrUpdateContactList) | **PUT** /contacts/list | 
*MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendMessage) | **POST** /messages | 


## Documentation for Models

 - [ActivityRecord](docs/ActivityRecord.md)
 - [Contact](docs/Contact.md)
 - [ContactList](docs/ContactList.md)
 - [Message](docs/Message.md)
 - [MessageContent](docs/MessageContent.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [Response](docs/Response.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ShoutOUTCustomAuthorizer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



