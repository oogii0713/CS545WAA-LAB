package edu.miu.controller;

import edu.miu.domain.Calc;
import edu.miu.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CalcController {

    private CalcService calcService;

    @Autowired
    private CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @RequestMapping(value = {"/", "/calculator"})
    public String calculator() { return "calculator";  }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(Calc calc, Model model) {
        List<String> errors = calcService.validate(calc);
        if (errors.isEmpty()) {
            model.addAttribute("result", calc);
            return "result";
        } else {
            model.addAttribute("errors", errors);
            model.addAttribute("form", calc);
            return "calculator";
        }
    }

}
