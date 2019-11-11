package com.notafiscal.notafiscal.controller;

import com.notafiscal.notafiscal.framework.CrudRestController;
import com.notafiscal.notafiscal.framework.CrudService;
import com.notafiscal.notafiscal.model.Cliente;
import com.notafiscal.notafiscal.model.Pedido;
import com.notafiscal.notafiscal.model.PedidoItem;
import com.notafiscal.notafiscal.service.PedidoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("nota-fiscal")
    public String listarProdutos( Model model){
        return "notafiscal";
    }

    @PostMapping
    public String adicionarItensPedido(@CookieValue("idCliente") Long idCliente, @RequestParam("produto") List<Long> idProdutoList, Model model){
        var pedido = new Pedido();
        pedido.setCliente(new Cliente(idCliente));
        var pedidoItemList = idProdutoList.stream()
                .map(idProduto -> new PedidoItem(pedido, idProduto))
                .collect(Collectors.toList());
        pedido.setItensPedido(pedidoItemList);
        pedido.setDataPedido(LocalDate.now());
        pedidoService.save(pedido);
        return "redirect:/pedido/por-id/" + pedido.getId();
    }

    @GetMapping("por-id/{id}")
    public String notafiscal(@PathVariable("id") Integer id, Model model){
        model.addAttribute("pedido", pedidoService.findById(id).get());
        return "notafiscal";
    }



}
