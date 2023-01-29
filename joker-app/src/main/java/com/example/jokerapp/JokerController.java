package com.example.jokerapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokerController {

    private JokerService jokerService;

    public JokerController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

    @GetMapping({"/",""})
    public String showNotify(Model model){
        model.addAttribute("slogan",jokerService.getJoker());
        return "index";
    }
}
