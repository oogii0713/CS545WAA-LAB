package edu.miu.controller;

import edu.miu.service.LoginService;
import edu.miu.service.RoastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RoastService roastService;

    @RequestMapping(value = {"/"})
    public String login() {
        return "login";
    }

    @PostMapping("/login.do")
    public String test(@RequestParam() String name, @RequestParam() String password) {
        if (name == "" || password == "") {
            return "login";
        } else if (loginService.checkValidUser(name, password)) {
            return "LoginSuccessful";
        } else {
            return "login";
        }
    }

    @GetMapping("/advice")
    public String advice(Model model) {
        Map< String, String > roastMap = new HashMap<String, String>();
        roastMap.put("Light", "light");
        roastMap.put("Medium", "medium");
        roastMap.put("Dark", "dark");

        model.addAttribute("roasts", roastMap);
        return "advice";
    }


    @PostMapping(value = "/display")
    public String adviceGet(Model model, @RequestParam() String roast) {
        model.addAttribute("roastList", roastService.getAdvice(roast));
        model.addAttribute("roast", true);
        return "display";
    }
}
