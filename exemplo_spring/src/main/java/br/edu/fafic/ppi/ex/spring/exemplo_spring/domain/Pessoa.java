package br.edu.fafic.ppi.ex.spring.exemplo_spring.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}
