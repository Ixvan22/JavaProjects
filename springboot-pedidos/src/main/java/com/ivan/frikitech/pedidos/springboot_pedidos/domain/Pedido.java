package com.ivan.frikitech.pedidos.springboot_pedidos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

  private Long pedidoId;
  private Long productoId;
  private int cantidad;
  private double total;

}
