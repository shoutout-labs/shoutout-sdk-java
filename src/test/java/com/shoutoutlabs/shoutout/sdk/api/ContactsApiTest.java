package com.shoutoutlabs.shoutout.sdk.api;

import com.shoutoutlabs.shoutout.sdk.ApiException;
import com.shoutoutlabs.shoutout.sdk.model.ContactList;
import com.shoutoutlabs.shoutout.sdk.model.Contact;
import org.junit.Test;

/**
 * API tests for ContactsApi
 */
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * 
     *
     * Create contact or replace if exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrReplaceContactTest() throws ApiException {
        String authorization = null;
        Contact contact = null;
        // api.createOrReplaceContact(authorization, contact);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create contact list or replace if exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrReplaceContactListTest() throws ApiException {
        String authorization = null;
        ContactList contactList = null;
        // ContactList response = api.createOrReplaceContactList(authorization, contactList);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create contact or update if exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateContactTest() throws ApiException {
        String authorization = null;
        Contact contact = null;
        // Contact response = api.createOrUpdateContact(authorization, contact);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create contact list or update if exists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateContactListTest() throws ApiException {
        String authorization = null;
        ContactList contactList = null;
        // ContactList response = api.createOrUpdateContactList(authorization, contactList);

        // TODO: test validations
    }
    
}
