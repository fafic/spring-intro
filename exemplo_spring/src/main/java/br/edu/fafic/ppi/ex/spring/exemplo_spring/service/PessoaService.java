package br.edu.fafic.ppi.ex.spring.exemplo_spring.service;

import br.edu.fafic.ppi.ex.spring.exemplo_spring.domain.Pessoa;
import br.edu.fafic.ppi.ex.spring.exemplo_spring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa save(Pessoa pessoa){
      return repository.save(pessoa);
    }

    public Pessoa pessoaByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }
}
