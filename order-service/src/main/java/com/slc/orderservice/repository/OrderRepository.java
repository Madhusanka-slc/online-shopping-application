package com.slc.orderservice.repository;

import com.slc.orderservice.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
