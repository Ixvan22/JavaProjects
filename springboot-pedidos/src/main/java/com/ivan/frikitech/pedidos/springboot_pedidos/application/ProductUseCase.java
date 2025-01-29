package com.ivan.frikitech.pedidos.springboot_pedidos.application;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.models.Product;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ProductUseCase {

  private final ProductRepository productRepository;

    public Product crearProducto(String nombre, String descripcion, double precio) {
      Product product = new Product(null, nombre, descripcion, precio);
      return productRepository.create(product);
    }

    public List<Product> listProducts() {
      return productRepository.listProducts();
    }
}
