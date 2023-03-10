package com.example.CssTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BlogRepo blogRepo;

    @GetMapping("/")
    public String mainPage (Model model, @ModelAttribute UserProfile userProfile) {
        model.addAttribute("user", userProfile);
        return "mainPage";
    }

    @PostMapping ("/")
    public String mainPage (Model model, @RequestParam String username, @RequestParam String password){
        Optional<UserProfile> up = userRepo.findByUsernameAndPassword(username, password);
        if(up.isEmpty()){
            return "redirect:/";
        }
        return "redirect:/forum";
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

    @GetMapping("/forum")
    public String forum (Model model){
        List<BlogPost> blog = (List)blogRepo.findAll();
        model.addAttribute("blogpost",blog);
        return "forum";
    }

    @GetMapping("/newblogpost")
    public String createBlogpost (Model model){
        model.addAttribute("blogpost", new BlogPost());
        return "blogPost";
    }

    @PostMapping("/saveBlogpost")
    public String createBlogpost (@ModelAttribute BlogPost blogPost) {
        System.out.println(blogPost.getHeadline());
        System.out.println(blogPost.getBlogposttext());
        blogRepo.save(blogPost);
        return "redirect:/forum";
    }
}
