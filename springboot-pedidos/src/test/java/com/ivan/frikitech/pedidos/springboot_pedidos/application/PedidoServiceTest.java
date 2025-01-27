package com.ivan.frikitech.pedidos.springboot_pedidos.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PedidoServiceTest {

  @Autowired
  private PedidoService service;

  @Test
  void calcularTotalTest() {
    assertEquals(10, service.calcularTotal(5, 2));
  }

}