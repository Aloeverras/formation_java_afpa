package com.afpa.formation_afpa_java.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @GetMapping("convert")
    public String convertTemperature(@RequestParam(value = "celsius") double c){
        double f = (c * (double) 9/5) + 32;
        return "C°" + c + " = " + "F°" + f;
    }

}
