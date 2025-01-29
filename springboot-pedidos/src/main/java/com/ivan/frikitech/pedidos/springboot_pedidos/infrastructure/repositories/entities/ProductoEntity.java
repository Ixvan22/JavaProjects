package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "producto_id")
  private Long productoId;
  private String nombre;
  private String descripcion;
  private double precio;

}
