package br.edu.fafic.ppi.ex.spring.exemplo_spring.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Pessoa {

    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String cpf;

    @Embedded
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;
}
