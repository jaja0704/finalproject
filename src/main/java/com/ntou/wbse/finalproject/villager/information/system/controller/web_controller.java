package com.ntou.wbse.finalproject.villager.information.system.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class web_controller {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/searchChr")
    public String searchchr() {
        return "searchchr";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/fishing")
    public String fishing() {
        return "fishing";
    }

}
