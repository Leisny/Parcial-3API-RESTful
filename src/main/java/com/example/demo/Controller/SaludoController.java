package com.example.demo.Controller;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class SaludoController {

    private final MessageSource messageSource;

    // Constructor para inyección de dependencias
    public SaludoController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/saludo")
    public String obtenerSaludo(@RequestParam(name = "lang", defaultValue = "es") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        return messageSource.getMessage("saludo", null, locale);
    }
}
