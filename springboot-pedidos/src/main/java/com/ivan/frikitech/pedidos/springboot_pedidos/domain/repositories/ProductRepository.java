package com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
  Product create(Product product);
  List<Product> listProducts();
  Product listProductById(Long id);
}
