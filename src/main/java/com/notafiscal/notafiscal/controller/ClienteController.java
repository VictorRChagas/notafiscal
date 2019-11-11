package com.notafiscal.notafiscal.controller;

import com.notafiscal.notafiscal.framework.CrudRestController;
import com.notafiscal.notafiscal.framework.CrudService;
import com.notafiscal.notafiscal.model.Cliente;
import com.notafiscal.notafiscal.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("cliente")
public class ClienteController extends CrudRestController<Cliente, Long> {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public CrudService<Cliente, Long> getService() {
        return clienteService;
    }

    @GetMapping("cadastro-cliente")
    public String cadastroCliente( Model model){
        return "cadastro-cliente";
    }

    @PostMapping("cadastro-cliente")
    @ResponseBody
    public String cadastroCliente(@ModelAttribute Cliente cliente) {
        clienteService.save(cliente);
        return "deu bom";
    }
}
