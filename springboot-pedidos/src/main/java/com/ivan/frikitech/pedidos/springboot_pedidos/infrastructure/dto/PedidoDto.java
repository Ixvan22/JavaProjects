package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto;

import lombok.Data;

@Data
public class PedidoDto {

  private Long pedidoId;
  private Long productoId;
  private int cantidad;
  private double total;

}
