package com.example.simplespringmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MenuController {
	@GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}
