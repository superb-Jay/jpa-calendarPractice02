package com.example.jpacalendarpractice02.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goSignUp")
    public String goSignUp() {
        return "signup";
    }

    @GetMapping("/goCalendar")
    public String goCalendar() {
        return "calendar";
    }

}
