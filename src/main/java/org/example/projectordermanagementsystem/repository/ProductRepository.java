package org.example.projectordermanagementsystem.repository;

import org.example.projectordermanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom query methods can be added here if needed
}

