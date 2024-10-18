package org.luissilva.e_shop.repository;

import org.luissilva.e_shop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
