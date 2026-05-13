package com.project.securityapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello";
    }

    @GetMapping("/")
    public String home()
    {
        return "Public Home";
    }

    @GetMapping("/user")
    public  String user()
    {
        return "Welcome User";
    }

    @GetMapping("/admin")
    public  String admin()
    {
        return "Welcome Admin";
    }
}
