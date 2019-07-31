package com.auth0.troubles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TroublesController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, dear visitor.";
    }

    @GetMapping("/secured")
    public String helloUser() {
        return "Hello, dear user.";
    }
}
