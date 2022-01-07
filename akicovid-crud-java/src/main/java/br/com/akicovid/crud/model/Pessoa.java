package br.com.akicovid.crud.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=200, nullable=false)
    private String nome;

    @Column(length=14, nullable=false)
    private String cpf;


}
