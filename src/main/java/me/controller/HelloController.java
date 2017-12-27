package me.controller;

import me.properties.MeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
//    @Value("${param.content}")
//    private String content;

    @Autowired
    private MeProperties meProperties;

    @RequestMapping(value="/hello/{name}" , method = RequestMethod.GET)
    public String say(@PathVariable String name) {
        return "welcome to learn spring-boot , " + name + " .  my info : "
                + meProperties.getName() + " , age : "
                + meProperties.getAge();
//        return content;
    }

    

}
