package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.controllers;

import com.ivan.frikitech.pedidos.springboot_pedidos.application.PedidoUseCase;
import com.ivan.frikitech.pedidos.springboot_pedidos.application.ProductUseCase;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.PedidoDto;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.ProductoDto;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers.PedidoMapper;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers.ProductoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductoController {

  private final ProductUseCase productUseCase;
  private final PedidoUseCase pedidoUseCase;

  private final ProductoMapper productoMapper;
  private final PedidoMapper pedidoMapper;

  @PostMapping("/productos")
  public ResponseEntity<ProductoDto> crearProducto(@RequestParam String nombre,
                                                   @RequestParam String descripcion,
                                                   @RequestParam double precio) {

    return ResponseEntity.ok(productoMapper.toDto(productUseCase.crearProducto(nombre, descripcion, precio)));
  }

  @GetMapping("/productos")
  public ResponseEntity<List<ProductoDto>> listarProductos() {
    return ResponseEntity.ok(productoMapper.productoEntitiesToDtos(productUseCase.listProducts()));
  }

  @PostMapping("/pedidos")
  public ResponseEntity<PedidoDto> crearPedido(@RequestParam Long productoId,
                                               @RequestParam int cantidad) {

    return ResponseEntity.ok(pedidoMapper.toDto(pedidoUseCase.crearPedido(productoId, cantidad)));
  }

  @GetMapping("/pedidos")
  public ResponseEntity<List<PedidoDto>> listarPedidos() {
    return ResponseEntity.ok(pedidoMapper.productoEntitiesToDtos(pedidoUseCase.listPedidos()));
  }

}
