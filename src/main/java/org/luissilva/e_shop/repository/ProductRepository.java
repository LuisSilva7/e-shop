package org.luissilva.e_shop.repository;

import org.luissilva.e_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
