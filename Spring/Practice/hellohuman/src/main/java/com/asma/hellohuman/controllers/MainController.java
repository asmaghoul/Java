package com.asma.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {

    @RequestMapping("/hello")
    public String hello(
            @RequestParam(value = "first name", required = false) String fname,
            @RequestParam(value = "last name", required = false) String lname,
            @RequestParam(value = "number", required = false) Integer num) {

        if (fname == null || lname == null || num == null) {
            return "Hello Person!";
        }

        ArrayList<String> msgList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String msg = String.format("Hello %s %s !", fname, lname);
            msgList.add(msg);
            System.out.println(msg);
        }

        String list = msgList.toString();
        System.out.println(list);

        return list;
    }
}