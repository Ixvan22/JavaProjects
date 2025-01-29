package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure;

import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

  List<ProductoEntity> findAll();
}
