package com.juniordev.phonebook.phonebook.Controller;

import com.juniordev.phonebook.phonebook.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PhonebookController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/")
    public String index(){
        return "greeting";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/list")
    public String list(Map<String,Object> model){
        model.put("contacts",contactService.listDummyContacts());
        return "list";
    }
}
