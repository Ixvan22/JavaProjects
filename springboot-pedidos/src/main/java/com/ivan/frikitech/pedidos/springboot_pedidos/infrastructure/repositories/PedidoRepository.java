package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories.entities.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

  List<PedidoEntity> findAll();

}
