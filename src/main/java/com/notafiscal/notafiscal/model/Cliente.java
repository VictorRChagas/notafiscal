package com.notafiscal.notafiscal.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CLIENTE")
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;

    public Cliente(Long id) {
        this.id = id;
    }
}
