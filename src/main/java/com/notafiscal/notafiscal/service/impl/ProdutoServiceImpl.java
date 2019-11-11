package com.notafiscal.notafiscal.service.impl;

import com.notafiscal.notafiscal.data.ProdutoData;
import com.notafiscal.notafiscal.framework.CrudServiceImpl;
import com.notafiscal.notafiscal.model.Produto;
import com.notafiscal.notafiscal.service.ProdutoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    private final ProdutoData produtoData;

    public ProdutoServiceImpl(ProdutoData produtoData) {
        this.produtoData = produtoData;
    }

    @Override
    public JpaRepository<Produto, Long> getRepository() {
        return produtoData;
    }
}
