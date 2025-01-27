package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto;

import lombok.Data;

@Data
public class ProductoDto {

  private Long productoId;
  private String nombre;
  private String descripcion;
  private double precio;

}
