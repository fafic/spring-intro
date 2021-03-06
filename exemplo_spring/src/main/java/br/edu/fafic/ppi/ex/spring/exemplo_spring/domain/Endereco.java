package br.edu.fafic.ppi.ex.spring.exemplo_spring.domain;

import lombok.*;

import javax.persistence.Embeddable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Embeddable
public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;

}
