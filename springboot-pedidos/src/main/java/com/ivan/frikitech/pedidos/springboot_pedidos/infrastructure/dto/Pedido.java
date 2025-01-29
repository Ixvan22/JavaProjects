package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto;

import lombok.Data;

@Data
public class Pedido {

  private Long pedidoId;
  private Long productoId;
  private int cantidad;
  private double total;

}
