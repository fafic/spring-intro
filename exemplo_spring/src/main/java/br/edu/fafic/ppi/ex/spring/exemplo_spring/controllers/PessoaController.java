package br.edu.fafic.ppi.ex.spring.exemplo_spring.controllers;

import br.edu.fafic.ppi.ex.spring.exemplo_spring.domain.Pessoa;
import br.edu.fafic.ppi.ex.spring.exemplo_spring.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity save(@RequestBody Pessoa pessoa){
        Pessoa p = pessoaService.save(pessoa);
        return ResponseEntity.ok().body(p);
    }
}
