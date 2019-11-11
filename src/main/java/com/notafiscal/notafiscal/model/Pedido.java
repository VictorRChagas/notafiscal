package com.notafiscal.notafiscal.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DATA_PEDIDO", nullable = false)
    private LocalDate dataPedido;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    @JsonManagedReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<PedidoItem> itensPedido = new ArrayList<>();

    public BigDecimal getValorTotal(){
        return itensPedido
                .stream()
                .map(i -> i.getProduto().getValorUnitario().multiply(BigDecimal.valueOf(i.getQuantidadeProdutos())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
