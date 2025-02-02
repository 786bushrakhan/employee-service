package com.example.employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/api/employees")
    public String getEmployee(){
        return "Bushra";

    }
}
