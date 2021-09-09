package br.edu.fafic.ppi.ex.spring.exemplo_spring.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Contato {

    @Id
    @GeneratedValue
    private UUID id;
    private String email;
    private String telefone;
}
