package com.auth0.redditapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, dear visitor.";
    }

    @GetMapping("/secured")
    public String helloUser() {
        return "Hello, dear user.";
    }
}
