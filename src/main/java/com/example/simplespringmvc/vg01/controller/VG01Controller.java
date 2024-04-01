package com.example.simplespringmvc.vg01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class VG01Controller {

	@GetMapping("/VG01")
    public String init() {
        return "VG01";
    }
}
