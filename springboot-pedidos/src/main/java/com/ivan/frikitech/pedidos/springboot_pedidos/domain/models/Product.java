package com.ivan.frikitech.pedidos.springboot_pedidos.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Long productoId;
  private String nombre;
  private String descripcion;
  private double precio;

}
