package com.naimish.SpringEcom.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomController {
    @GetMapping({"/", "home"})
    public String home(){
        return "Hello";
    }



}
