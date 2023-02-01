package com.example.CssTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @GetMapping("/")
    public String showSmtm() {
        return "HelloWorld";
    }

}
