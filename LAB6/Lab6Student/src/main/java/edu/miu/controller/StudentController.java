package edu.miu.controller;

import edu.miu.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class StudentController {

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("student") Student student, Model model) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        redirectAttributes.addFlashAttribute(student);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String result(Model model) {
        return "success";
    }

}

	

