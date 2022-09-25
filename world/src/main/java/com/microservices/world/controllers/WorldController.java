package com.microservices.world.controllers;

import org.apache.http.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class WorldController {

    @GetMapping(value = "/world")
    public String getWorld(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "World";
    }
}
