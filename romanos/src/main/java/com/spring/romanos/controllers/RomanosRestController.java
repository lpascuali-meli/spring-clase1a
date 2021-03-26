package com.spring.romanos.controllers;

import com.spring.romanos.entities.Numero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanosRestController {
    @GetMapping("/to-romano")
    public String getNumeroRomano(@RequestParam Integer number) {
        System.out.println(number);
        Numero romanNumber = new Numero(number);
        return "El número romano es: " + romanNumber.toRomano();
    }
}
