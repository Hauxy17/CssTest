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
    public String mainPage (Model model, @ModelAttribute UserProfile userProfile) {
//        userRepo.login(username, password);
        model.addAttribute("user", userProfile);
        return "mainPage";
    }

    @PostMapping ("/")
    public String mainPage (Model model, @RequestParam String username, @RequestParam String password){
        userRepo.login(username, password);
        return "redirect:/helloWorld";
    }

    @GetMapping("/createUser")
    public String create(Model model) {
        model.addAttribute("userProfile", new UserProfile());
        return "createUser";
    }

    @PostMapping("/save")
    public String createUser (@ModelAttribute UserProfile userProfile) {
        userRepo.save(userProfile);
        return "redirect:/";
    }


    @GetMapping("/error")
    public String error(){
        return "error";
    }




}
