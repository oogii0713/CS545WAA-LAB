package edu.miu.lab10.controller;

import edu.miu.lab10.domain.Employee;
import edu.miu.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping({ "/list", "" })
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @RequestMapping("/employee")
    public String getEmployeeByNumber(Model model, @RequestParam("id") int employeeId) {
        System.out.println("employeeId");
        Employee employee = employeeService.getEmployeeByNumber(employeeId);
        model.addAttribute("employee", employee);
        return "employee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
        return "addEmployee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employeeToBeAdded, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "addEmployee";

        employeeService.addNewEmployee(employeeToBeAdded);
        return "redirect:list";

    }

}

