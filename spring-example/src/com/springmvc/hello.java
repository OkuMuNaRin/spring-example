package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class hello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name,Model model){
model.addAttribute("name",name);
        return "hello";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
