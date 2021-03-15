package com.radar.bottle.controller;

import com.radar.bottle.client.BoxClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private BoxClient boxClient;
    @GetMapping("/hello")
    public String home() {
        return "Hello bottle";
    }
    @GetMapping("callBox")
    public String testBox() {
        return  boxClient.callBox();
    }
}
