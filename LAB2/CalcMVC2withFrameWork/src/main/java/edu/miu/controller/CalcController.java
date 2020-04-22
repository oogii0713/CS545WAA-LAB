package edu.miu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.domain.Calc;
import edu.miu.validator.CalcValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;

import java.util.List;

@Controller
public class CalcController {

    @AutoWired
    CalcValidator calcValidator;

    @RequestMapping(value = {"/", "/calculator"})
    public String calculator(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/views/calculator.jsp";
    }

    @RequestMapping(value = "/result")
    public String result(Calc calc, HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = calcValidator.validate(calc);
        if (errors.isEmpty()) {
            request.setAttribute("result", calc);
            return "/WEB-INF/views/result.jsp";
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("form", calc);
            return "/WEB-INF/views/calculator.jsp";
        }
    }

}
