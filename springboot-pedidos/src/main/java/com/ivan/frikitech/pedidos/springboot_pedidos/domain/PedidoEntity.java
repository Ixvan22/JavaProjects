package com.ivan.frikitech.pedidos.springboot_pedidos.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pedido_id")
  private Long pedidoId;
  private Long productoId;
  private int cantidad;
  private double total;

}
