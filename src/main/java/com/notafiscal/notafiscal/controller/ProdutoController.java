package com.notafiscal.notafiscal.controller;

import com.notafiscal.notafiscal.framework.CrudRestController;
import com.notafiscal.notafiscal.framework.CrudService;
import com.notafiscal.notafiscal.model.Cliente;
import com.notafiscal.notafiscal.model.Pedido;
import com.notafiscal.notafiscal.model.PedidoItem;
import com.notafiscal.notafiscal.model.Produto;
import com.notafiscal.notafiscal.service.PedidoItemService;
import com.notafiscal.notafiscal.service.PedidoService;
import com.notafiscal.notafiscal.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("produto")
public class ProdutoController extends CrudRestController<Produto, Long> {

    private final ProdutoService produtoService;
    private final PedidoItemService pedidoItemService;
    @Autowired private PedidoService pedidoService;

    public ProdutoController(ProdutoService produtoService, PedidoItemService pedidoItemService) {
        this.produtoService = produtoService;
        this.pedidoItemService = pedidoItemService;
    }

    @Override
    public CrudService<Produto, Long> getService() {
        return produtoService;
    }

    @GetMapping("cadastro-produto")
    public String cadastroProduto( Model model){
        return "cadastro-produto";
    }

    @PostMapping("cadastro-produto")
    public String salvarProduto(@ModelAttribute Produto produto){
        produtoService.save(produto);
        return "deu bom";
    }

    @GetMapping("produto-detalhes")
    public String descricaoProduto( Model model){
        return "produto";
    }

    @GetMapping("lista-produtos")
    public String listarProdutos(Long idCliente, Model model){
        model.addAttribute("produtos", produtoService.findAll());
        return "listar-itens-produto";
    }


}
