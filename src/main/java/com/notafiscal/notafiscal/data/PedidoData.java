package com.notafiscal.notafiscal.data;

import com.notafiscal.notafiscal.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoData extends JpaRepository<Pedido, Integer> {
}
