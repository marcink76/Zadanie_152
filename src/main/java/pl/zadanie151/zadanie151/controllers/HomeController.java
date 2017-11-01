package pl.zadanie151.zadanie151.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tekstMessage", "Co chcesz zrobić?");

        return "index";
    }
}