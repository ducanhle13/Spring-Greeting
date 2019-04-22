package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @PostMapping ("/convertered")
    public String greeting( Float rate, Float usd, Model modle){
        float vnd = rate * usd;
        modle.addAttribute("vnd", vnd);
        return "index";
    }

    @GetMapping("/converter")
    public String show(){
        return "index";
    }
}