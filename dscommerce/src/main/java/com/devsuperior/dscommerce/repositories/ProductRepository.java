package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM tb_product WHERE LOWER(name) LIKE LOWER(CONCAT('%', :name, '%'))",
            nativeQuery = true)
    Page<Product> searchByName(@Param("name") String name, Pageable pageable);
}
