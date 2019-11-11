package com.notafiscal.notafiscal.service.impl;

import com.notafiscal.notafiscal.data.PedidoItemData;
import com.notafiscal.notafiscal.framework.CrudServiceImpl;
import com.notafiscal.notafiscal.model.PedidoItem;
import com.notafiscal.notafiscal.service.PedidoItemService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoItemServiceImpl extends CrudServiceImpl<PedidoItem, Long> implements PedidoItemService {

    @Override
    public JpaRepository<PedidoItem, Long> getRepository() {
        return null;
    }
}
