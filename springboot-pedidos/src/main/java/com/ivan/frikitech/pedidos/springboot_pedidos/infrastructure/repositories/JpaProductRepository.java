package com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.repositories;

import com.ivan.frikitech.pedidos.springboot_pedidos.domain.Product;
import com.ivan.frikitech.pedidos.springboot_pedidos.domain.repositories.ProductRepository;
import com.ivan.frikitech.pedidos.springboot_pedidos.infrastructure.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Component
public class JpaProductRepository implements ProductRepository {

  private final ProductoRepository productoRepository;

  @Transactional
  @Override
  public Product create(Product product) {
    ProductoEntity productoEntitty = new ProductoEntity(product.getProductoId(),
            product.getNombre(),
            product.getDescripcion(),
            product.getPrecio());

    ProductoEntity productoEntityDb =  productoRepository.save(productoEntitty);
    Product productDb = new Product(productoEntityDb.getProductoId(),
            productoEntityDb.getNombre(),
            productoEntityDb.getDescripcion(),
            productoEntityDb.getPrecio());

    return productDb;
  }

  @Transactional(readOnly = true)
  @Override
  public List<Product> listProducts() {
    return productoRepository.findAll().stream().map(productoEntity -> new Product(productoEntity.getProductoId(),
            productoEntity.getNombre(), productoEntity.getDescripcion(), productoEntity.getPrecio())).toList();

  }

  @Transactional(readOnly = true)
  @Override
  public Product listProductById(Long id) {
    ProductoEntity productoEntity = productoRepository.findById(id).orElseThrow();
    Product product = new Product(productoEntity.getProductoId(),
            productoEntity.getNombre(),
            productoEntity.getDescripcion(),
            productoEntity.getPrecio());
    return product;
  }
}
