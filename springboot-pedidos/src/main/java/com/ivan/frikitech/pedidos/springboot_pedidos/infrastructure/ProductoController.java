package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure;

import com.ivan.frikitech.pedidos.springboot_pedidos.application.PedidoService;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.PedidoEntity;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.ProductoEntitty;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.PedidoDto;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.dto.ProductoDto;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers.PedidoDtoMapper;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.mappers.ProductoDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

  @Autowired
  private ProductoRepository productoRepository;

  @Autowired
  private PedidoRepository pedidoRepository;

  @Autowired
  private PedidoService pedidoService;

  @Autowired
  private ProductoDtoMapper productoMapper;

  @Autowired
  private PedidoDtoMapper pedidoMapper;

  @PostMapping("/productos")
  public ResponseEntity<ProductoDto> crearProducto(@RequestParam String nombre,
                                                   @RequestParam String descripcion,
                                                   @RequestParam double precio) {

    return ResponseEntity.ok(productoMapper.toDto(productoRepository.save(new ProductoEntitty(null, nombre, descripcion, precio))));
  }

  @GetMapping("/productos")
  public ResponseEntity<List<ProductoDto>> listarProductos() {
    return ResponseEntity.ok(productoMapper.productoEntitiesToDtos(productoRepository.findAll()));
  }

  @PostMapping("/pedidos")
  public ResponseEntity<PedidoDto> crearPedido(@RequestParam Long productoId,
                                               @RequestParam int cantidad) {

    double precio = productoRepository.findById(productoId).orElseThrow().getPrecio();
    double total = pedidoService.calcularTotal(precio, cantidad);

    return ResponseEntity.ok(pedidoMapper.toDto(pedidoRepository.save(new PedidoEntity(null, productoId, cantidad, total))));
  }

  @GetMapping("/pedidos")
  public ResponseEntity<List<PedidoDto>> listarPedidos() {
    return ResponseEntity.ok(pedidoMapper.productoEntitiesToDtos(pedidoRepository.findAll()));
  }
}
