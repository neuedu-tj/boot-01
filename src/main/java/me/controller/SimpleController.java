package me.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/simple")
public class SimpleController {

    @RequestMapping(value = "/visit" , method = RequestMethod.GET)
    public String visit() {
        return "index";
    }

    @GetMapping(value = "visit2")
    public String visit2() {
        System.out.println("visit2");
        return "index";
    }

}
