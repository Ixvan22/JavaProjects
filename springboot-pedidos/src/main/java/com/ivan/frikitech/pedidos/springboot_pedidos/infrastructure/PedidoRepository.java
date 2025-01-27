package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

  List<PedidoEntity> findAll();

}
