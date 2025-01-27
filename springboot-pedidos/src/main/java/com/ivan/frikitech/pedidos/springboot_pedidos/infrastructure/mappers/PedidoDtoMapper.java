package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.PedidoEntity;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.PedidoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoDtoMapper {

  PedidoDto toDto(PedidoEntity domain);

}
