package com.juniordev.phonebook.phonebook.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhonebookController {

    @RequestMapping("/")
    public String index(){
        return "greeting";
    }
}
