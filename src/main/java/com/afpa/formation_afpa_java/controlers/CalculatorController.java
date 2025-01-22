package com.afpa.formation_afpa_java.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public double calculAdd(@RequestParam(required = true) double a, double b) {
        return  a + b;
    }

    @GetMapping("/multiply/{a}/{b}")
    public String calculMult(@PathVariable("a") double a, @PathVariable("b") double b){
        if (a == 0 || b == 0){
            throw new IllegalArgumentException();
        } else {
            double multi = a * b;
            return  "The result of multiplication is " + multi;
        }
    }
}
