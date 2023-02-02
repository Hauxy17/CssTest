package com.example.CssTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/helloWorld")
    public String helloWorld () {
        return "helloWorld";
    }

    @GetMapping("/")
    public String mainPage () {
        return "mainPage";
    }

    @GetMapping("/createUser")
    public String create(Model model) {
        model.addAttribute("user", new User());
        return "createUser";
    }

    @PostMapping("/createUser")
    public String createUser (@ModelAttribute User user) {
        userRepo.save(user);
        return "redirect:/";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }


}
