package com.juniordev.phonebook.phonebook.DBA;

import com.juniordev.phonebook.phonebook.Model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {

    List<Contact> findByFirstName(String firstName);
}
