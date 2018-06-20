package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 * @date 18/5/17 14:47.
 */
@RestController
public class DemoController {

    @GetMapping("/entrance")
    public String home() {
        return "home";
    }

    @GetMapping("/index")
    public String index() {
        return "ok";
    }
}
