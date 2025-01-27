package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.ProductoEntitty;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoDtoMapper {

  ProductoDto toDto(ProductoEntitty domain);
  List<ProductoDto> productoEntitiesToDtos(List<ProductoEntitty> productoEntities);
}
