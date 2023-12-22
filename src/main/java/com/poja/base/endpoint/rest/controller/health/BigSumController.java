package com.poja.base.endpoint.rest.controller.health;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSumController {
    private final BigSumCalculationService service;
    @GetMapping("/big-sum")
    public BigInteger add(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        return service.add(a, b);
    }
}


