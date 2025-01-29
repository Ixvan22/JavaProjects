package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Product;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.Producto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

  Producto toDto(Product domain);
  List<Producto> productoEntitiesToDtos(List<Product> productoEntities);
}
