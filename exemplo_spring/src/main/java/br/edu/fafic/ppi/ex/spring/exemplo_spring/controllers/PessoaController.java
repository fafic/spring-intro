package br.edu.fafic.ppi.ex.spring.exemplo_spring.controllers;

import br.edu.fafic.ppi.ex.spring.exemplo_spring.domain.Pessoa;
import br.edu.fafic.ppi.ex.spring.exemplo_spring.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/{cpf}")
    public ResponseEntity findByCpf(@PathVariable String cpf){
        Pessoa pessoa = pessoaService.pessoaByCpf(cpf);
        return ResponseEntity.ok().body(pessoa);
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity findAll(){
        List<Pessoa> pessoas = pessoaService.findAll();
        return ResponseEntity.ok().body(pessoas);
    }
}
