package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Contact;
import io.swagger.client.model.ContactList;
import io.swagger.client.model.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
