package edu.miu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.miu.domain.Employee;
 
@Controller
public class EmployeeController {

    @GetMapping("/")
    public String index() {
        return "employee";
    }

    @PostMapping("/")
    public @ResponseBody Employee indexPost(@RequestBody @Valid Employee employee) {
        return employee;
    }
}
