package com.microservices.hello.controllers;

import com.microservices.hello.dtos.HelloResponseDTO;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloResponseDTO getHello(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        HelloResponseDTO dto = new HelloResponseDTO();
        dto.setData("Hello");
        dto.setStatus(response.getStatus());
        return dto;
    }
}
