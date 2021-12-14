package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gia_vi")
public class SpiceController {

    @GetMapping
    public String showIndex(){
        return "index_gia_vi";
    }

    @GetMapping("/submit")
    public String showResult(Model model, @RequestParam("condiment") String[] condiment){
        model.addAttribute("condiment",condiment);
        return "result_gia_vi";
    }
}