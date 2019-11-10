package com.microservice.api;

import com.microservice.service.IMicroserviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exceptions")
@RequiredArgsConstructor
public class MicroserviceController {
    private final IMicroserviceService service;
    private final Environment environment;

    @GetMapping("/controller")
    public void getControllerException() {
        System.out.println(environment.getProperty("EXCEPTIONS.EMAILS"));
    }

    @GetMapping("/service")
    public void getServiceException() {
        service.getServiceException();
    }

    @GetMapping("/database")
    public void getDatabaseException() {
        service.getDatabaseException();
    }

}