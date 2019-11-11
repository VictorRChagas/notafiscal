package com.notafiscal.notafiscal.controller;

import com.notafiscal.notafiscal.framework.CrudRestController;
import com.notafiscal.notafiscal.framework.CrudService;
import com.notafiscal.notafiscal.model.PedidoItem;
import com.notafiscal.notafiscal.service.PedidoItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidoitem")
public class PedidoItemController extends CrudRestController<PedidoItem, Long> {

    private final PedidoItemService pedidoItemService;

    public PedidoItemController(PedidoItemService pedidoItemService) {
        this.pedidoItemService = pedidoItemService;
    }

    @Override
    public CrudService getService() {
        return pedidoItemService;
    }
}
