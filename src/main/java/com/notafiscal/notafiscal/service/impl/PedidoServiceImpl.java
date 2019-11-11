package com.notafiscal.notafiscal.service.impl;

import com.notafiscal.notafiscal.data.PedidoData;
import com.notafiscal.notafiscal.framework.CrudServiceImpl;
import com.notafiscal.notafiscal.model.Pedido;
import com.notafiscal.notafiscal.service.PedidoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends CrudServiceImpl<Pedido, Integer> implements PedidoService {

    private final PedidoData pedidoData;

    public PedidoServiceImpl(PedidoData pedidoData) {
        this.pedidoData = pedidoData;
    }

    @Override
    public JpaRepository<Pedido, Integer> getRepository() {
        return pedidoData;
    }
}
