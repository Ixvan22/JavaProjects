package com.ivan.frikitech.pedidos.springboot_pedidos.application;

import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

  @Override
  public double calcularTotal(double precio, int cantidad) {
    return precio * cantidad;
  }

}
