package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.Pedido;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

  Pedido toDto(com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido domain);
  List<Pedido> productoEntitiesToDtos(List<com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido> pedidoEntities);

}
