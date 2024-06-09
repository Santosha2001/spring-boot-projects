package com.scm.services;

import java.util.List;

import com.scm.entities.Contact;

public interface ContactService {

    // add contact service
    Contact saveContact(Contact contact);

    // update contact service
    Contact updateContact(Contact contact);

    // delete contact service
    void deleteContact(String id);

    // get all contacts service
    List<Contact> getAllContats();

    // get contact by id service
    Contact getContactById(String id);

    // search contact by name, email, number
    List<Contact> searchContacts(String name, String email, String mobile);

    // get conatct by userId
    List<Contact> getContactsByUserId(String userId);
}
