package org.example.projectordermanagementsystem.repository;

import org.example.projectordermanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional custom query methods can be added here if needed
}

