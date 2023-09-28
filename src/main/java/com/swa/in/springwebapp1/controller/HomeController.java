package com.swa.in.springwebapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String getWelcomePage(Model model){
        model.addAttribute("msg","Welcome to Spring MVC App!");
        return  "welcome";
    }

}
