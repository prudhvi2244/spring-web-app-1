package com.example.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @GetMapping(value = "/saveEmployee")
    public String saveEmployee(){
        return "saveEmployee";
    }

}
