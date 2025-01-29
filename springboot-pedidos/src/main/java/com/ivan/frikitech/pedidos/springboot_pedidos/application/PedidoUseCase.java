package com.ivan.frikitech.pedidos.springboot_pedidos.application;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories.PedidosRepository;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PedidoUseCase {

  private final PedidosRepository pedidosRepository;
  private final ProductRepository productRepository;

  public Pedido crearPedido(Long productoId, int cantidad) {
    double total = productRepository.listProductById(productoId).getPrecio() * cantidad;
    Pedido pedido = new Pedido(null, productoId, cantidad, total);
    return pedidosRepository.create(pedido);
  }

  public List<Pedido> listPedidos() {
    return pedidosRepository.listPedidos();
  }
}
