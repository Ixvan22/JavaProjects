package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.ProductoEntitty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<ProductoEntitty, Long> {

  List<ProductoEntitty> findAll();
}
