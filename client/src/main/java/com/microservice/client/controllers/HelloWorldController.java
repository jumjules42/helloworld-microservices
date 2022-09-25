package com.microservice.client.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@Getter
@Setter
public class HelloWorldController {

    @Autowired
    private RestTemplate rest;

    @Value("${helloServiceURL}")
    private String helloServiceURL;

    @Value("${worldServiceURL}")
    private String worldServiceURL;

    @GetMapping("/")
    public String getHelloWorld() throws URISyntaxException {
        URI helloURI = new URI(getHelloServiceURL() + "/hello");
        URI worldURI = new URI(getWorldServiceURL() + "/world");

        String hello = rest.getForObject(helloURI, String.class);
        String world = rest.getForObject(worldURI, String.class);

        return hello + " " + world;
    }
}
