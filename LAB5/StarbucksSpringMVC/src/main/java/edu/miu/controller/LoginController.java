package edu.miu.controller;

import edu.miu.domain.User;
import edu.miu.service.LoginService;
import edu.miu.service.RoastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes({"userInfo","roasts"})
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private RoastService roastService;

    @GetMapping({"/", "/login", "/advice"})
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String authenticate(User user, Model model)  {
        if(!loginService.checkValidUser(user))
            return "redirect:/";

        Map< String, String > roastMap = new HashMap<String, String>();
        roastMap.put("Light", "light");
        roastMap.put("Medium", "medium");
        roastMap.put("Dark", "dark");
        model.addAttribute("userInfo",user);
        model.addAttribute("roasts", roastMap);
        return "redirect:/advice";
    }

    @PostMapping(value = "/display")
    public String adviceGet(Model model, @RequestParam() String roast) {
        model.addAttribute("roastList", roastService.getAdvice(roast));
        model.addAttribute("roast", true);
        return "display";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/";
    }
}
