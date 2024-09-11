package com.example.demo.Controller;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RestController1 {
    @GetMapping("/celsiusParaFahrenheit/{grau}")
    public double celsiusParaFahrenheit(@PathVariable double grau) { 
      
        return (grau * 1.8 + 32);
    }

    @GetMapping("/fahrenheitParaCelsius/{grau}")
    public double fahrenheitParaCelsius(@PathVariable double grau) {
        return ((grau - 32) / 1.8);
    }
}
