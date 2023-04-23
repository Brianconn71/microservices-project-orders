package com.msa.assignment.orderService.dao;

import com.msa.assignment.orderService.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderServiceRepository extends JpaRepository<Order, Long> {

}

