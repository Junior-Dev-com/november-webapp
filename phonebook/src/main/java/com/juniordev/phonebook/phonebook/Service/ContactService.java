package com.juniordev.phonebook.phonebook.Service;

import com.juniordev.phonebook.phonebook.DBA.ContactRepository;
import com.juniordev.phonebook.phonebook.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> listDummyContacts(){

        return contactRepository.findAll();
    }

    public void addDummyContacts(){
        contactRepository.save(new Contact("John","Doe","123456"));
        contactRepository.save(new Contact("Jane","Doe","1778890"));
        contactRepository.save(new Contact("Marry","Christmas","44455678"));

    }
}
