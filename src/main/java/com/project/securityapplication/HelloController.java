package com.project.securityapplication;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@PreAuthorize("hasRole('admin')")
    @PreAuthorize("hasAnyRole('admin','user')")
    @GetMapping("test")
    public String test()
    {
        return  "Test Working";
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

    @GetMapping("/denied")
    public String denied()
    {
        return "Access Denied";
    }
}
