package br.edu.fafic.ppi.ex.spring.exemplo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class ExemploController {

    @GetMapping
    public String hello(){
        return "Meu primeiro REST funcionando!";
    }

    @GetMapping(value = "/exemplo")
    public String teste(){
        return "Meu segundo REST funcionando!";
    }

}
