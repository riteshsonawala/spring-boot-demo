package com.riteshsonawala.controllers;

import com.riteshsonawala.domain.Greetings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/greetings/{name}")
    public Greetings handleRequest(@PathVariable String name){
        return new Greetings(name);
    }
}
