package com.notafiscal.notafiscal.data;

import com.notafiscal.notafiscal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteData extends JpaRepository<Cliente, Long> {
}
