package com.daimler.pf.test.controller;

import com.daimler.pf.test.service.RedisService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller("/api/v1")
@AllArgsConstructor
@Slf4j
public class PFController {

    private final RedisService redisService;

    @Get(uri = "/session", produces = MediaType.APPLICATION_JSON)
    public HttpResponse saveRandomStringToRedis() {
        redisService.testCrudOperations();
        return HttpResponse.ok();
    }
}
