package com.notafiscal.notafiscal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "PEDIDO_ITEM")
@NoArgsConstructor
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;

    @Column(name = "QUANTIDADE_PRODUTOS" ,nullable = false)
    private Integer quantidadeProdutos;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    public BigDecimal getValorTotal(){
        return produto.getValorUnitario().multiply(BigDecimal.valueOf(quantidadeProdutos));
    }

    public PedidoItem(Pedido pedido, Long idProduto) {
        this.pedido = pedido;
        this.produto = new Produto(idProduto);
        this.quantidadeProdutos = 1;
    }

}
