package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass
{

    @GetMapping("/sayHellow")
    public String sayHellow()
    {
        return "Om namah shivaya1 developer1 dsd";
    }
}
