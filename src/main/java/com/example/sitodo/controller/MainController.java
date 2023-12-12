package com.example.sitodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @GetMapping(method = RequestMethod.GET)
    public String showMainPage() {
        return "redirect:/list";
    }
}
