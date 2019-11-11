package com.notafiscal.notafiscal.data;

import com.notafiscal.notafiscal.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoData extends JpaRepository<Produto, Long> {
}
