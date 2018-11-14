package com.juniordev.phonebook.phonebook.Service;

import com.juniordev.phonebook.phonebook.DBA.ContactRepository;
import com.juniordev.phonebook.phonebook.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> listDummyContacts(){
        ArrayList<Contact> dummies = new ArrayList<>();
        dummies.add(new Contact("John","Doe","123456"));
        dummies.add(new Contact("Jane","Doe","1778890"));
        dummies.add(new Contact("Marry","Christmas","44455678"));
        return dummies;
    }
}
