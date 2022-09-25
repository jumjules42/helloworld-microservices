package com.microservices.hello.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloResponseDTO {
    public String data;
    public Integer status;
}
