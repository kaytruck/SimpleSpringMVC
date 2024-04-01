package com.example.simplespringmvc.vg00.controller;

import com.example.simplespringmvc.vg00.controller.dto.VG00Form;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/VG00")
public class VG00Controller {

    @ModelAttribute("VG00Form")
    public VG00Form initForm() {
        return new VG00Form();
    }

    @GetMapping
    public String init() {
        return "VG00";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("VG00Form") VG00Form form) {
        System.out.println("@@@@" + form.getUserid());
        return "VG01";
    }
}
