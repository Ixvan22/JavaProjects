package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

  List<ProductoEntity> findAll();
}
