package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Pedido;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.PedidoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

  PedidoDto toDto(Pedido domain);
  List<PedidoDto> productoEntitiesToDtos(List<Pedido> pedidoEntities);

}
