package com.notafiscal.notafiscal.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "PRODUTO")
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_PRODUTO", nullable = false)
    private String nomeProduto;

    @Column(name = "VALOR_PRODUTO", nullable = false)
    private BigDecimal valorUnitario;

    @Column(name = "QUANTIDADE_ESTOQUE", nullable = false)
    private Integer quantidadeEmEstoque;

    @Column(name = "DESCRICAO_PRODUTO", nullable = false)
    private String descricaoProduto;

    public Produto(Long id) {
        this.id = id;
    }

}
