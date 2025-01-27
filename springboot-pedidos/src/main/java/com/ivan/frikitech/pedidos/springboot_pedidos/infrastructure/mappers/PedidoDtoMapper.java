package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.PedidoEntity;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.PedidoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoDtoMapper {

  PedidoDto toDto(PedidoEntity domain);
  List<PedidoDto> productoEntitiesToDtos(List<PedidoEntity> pedidoEntities);

}
