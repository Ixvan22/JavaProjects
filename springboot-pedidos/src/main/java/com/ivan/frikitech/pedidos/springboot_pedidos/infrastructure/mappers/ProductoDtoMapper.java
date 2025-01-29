package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.Product;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoDtoMapper {

  ProductoDto toDto(Product domain);
  List<ProductoDto> productoEntitiesToDtos(List<Product> productoEntities);
}
