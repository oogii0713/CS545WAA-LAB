package edu.miu.controller;

import edu.miu.domain.Calc;
import edu.miu.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CalcController {

    private CalcService calcService;

    @Autowired
    private CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @RequestMapping(value = {"/", "/calculator"})
    public String calculator() { return "calculator"; }

    @PostMapping("/calculator")
    public String calculateInput(Calc calc, Model model, RedirectAttributes redirectAttributes) {
        List<String> errors = calcService.validate(calc);
        if (errors.isEmpty()) {
            redirectAttributes.addFlashAttribute("result",calc);
            redirectAttributes.addAttribute("welcome", "Welcome: Result of calculation");
            return "redirect:/result";
        } else {
            model.addAttribute("errors", errors);
            model.addAttribute("form", calc);
            return "calculator";
        }
    }

    @GetMapping("/result")
    public String result(Model model) {
        return "result";
    }

}
