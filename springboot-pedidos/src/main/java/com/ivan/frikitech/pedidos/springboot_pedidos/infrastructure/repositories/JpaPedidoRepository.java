package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories.PedidosRepository;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories.entities.PedidoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Component
public class JpaPedidoRepository implements PedidosRepository {

  private final PedidoRepository pedidoRepository;

  @Override
  public Pedido create(Pedido pedido) {
    PedidoEntity pedidoEntity = new PedidoEntity(pedido.getPedidoId(),
            pedido.getProductoId(),
            pedido.getCantidad(),
            pedido.getTotal());

    PedidoEntity pedidoEntityDb = pedidoRepository.save(pedidoEntity);
    Pedido pedidoDb = new Pedido(pedidoEntityDb.getPedidoId(),
            pedidoEntityDb.getProductoId(),
            pedidoEntityDb.getCantidad(),
            pedidoEntityDb.getTotal());

    return pedidoDb;
  }

  @Transactional(readOnly = true)
  @Override
  public List<Pedido> listPedidos() {
    return pedidoRepository.findAll().stream().map(pedidoEntity -> new Pedido(pedidoEntity.getPedidoId(),
            pedidoEntity.getProductoId(), pedidoEntity.getCantidad(), pedidoEntity.getTotal())).toList();

  }
}
