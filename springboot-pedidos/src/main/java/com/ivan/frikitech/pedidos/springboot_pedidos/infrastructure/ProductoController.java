package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure;

import com.ivan.frikitech.pedidos.springboot_pedidos.application.PedidoService;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.PedidoEntity;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.ProductoEntitty;
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

  @PostMapping("/productos")
  public ResponseEntity<ProductoEntitty> crearProducto(@RequestParam String nombre,
                                                       @RequestParam String descripcion,
                                                       @RequestParam double precio) {

    return ResponseEntity.ok(productoRepository.save(new ProductoEntitty(null, nombre, descripcion, precio)));
  }

  @GetMapping("/productos")
  public ResponseEntity<List<ProductoEntitty>> listarProductos() {
    return ResponseEntity.ok(productoRepository.findAll());
  }

  @PostMapping("/pedidos")
  public ResponseEntity<PedidoEntity> crearPedido(@RequestParam Long productoId,
                                                  @RequestParam int cantidad) {

    double precio = productoRepository.findByProductoId(productoId).getPrecio();
    double total = pedidoService.calcularTotal(precio, cantidad);


    return ResponseEntity.ok(pedidoRepository.save(new PedidoEntity(null, productoId, cantidad, total)));
  }
}
