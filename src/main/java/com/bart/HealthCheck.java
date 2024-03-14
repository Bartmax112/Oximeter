package com.bart;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;

@Controller("/health-check")
public class HealthCheck {
    @Get(produces=MediaType.TEXT_PLAIN)
    String healthCheck(){
        return "OK";
    }
}