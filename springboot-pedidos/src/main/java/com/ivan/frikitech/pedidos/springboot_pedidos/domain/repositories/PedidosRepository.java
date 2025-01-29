package com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PedidosRepository {
  Pedido create(Pedido pedido);
  List<Pedido> listPedidos();
}
