package com.lukes.microservices.limitsservice.controller;

import com.lukes.microservices.limitsservice.model.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyaegel on 07/25/2019
 */
@RestController
public class LimitsConfigurationController {

    @Value("${limits-service.minimum}")
    private int minimum;

    @Value("${limits-service.maximum}")
    private int maximum;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfig(){
        return new LimitsConfiguration(maximum, minimum);
    }
}
