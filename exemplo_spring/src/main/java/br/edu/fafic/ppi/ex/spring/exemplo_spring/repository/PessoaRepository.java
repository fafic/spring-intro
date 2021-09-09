package br.edu.fafic.ppi.ex.spring.exemplo_spring.repository;

import br.edu.fafic.ppi.ex.spring.exemplo_spring.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

    Pessoa findByCpf(String cpf);
    //select p from Pessoa p where p.nome =:nome and p.cpf =:cpf
    Pessoa findByCpfAndNome(String cpf, String nome);


}
