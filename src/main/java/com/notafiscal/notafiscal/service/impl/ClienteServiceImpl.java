package com.notafiscal.notafiscal.service.impl;

import com.notafiscal.notafiscal.data.ClienteData;
import com.notafiscal.notafiscal.framework.CrudServiceImpl;
import com.notafiscal.notafiscal.model.Cliente;
import com.notafiscal.notafiscal.service.ClienteService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Long> implements ClienteService {

    private final ClienteData clienteData;

    public ClienteServiceImpl(ClienteData clienteData) { this.clienteData = clienteData; }

    @Override
    public JpaRepository<Cliente, Long> getRepository() {
        return clienteData;
    }
}
