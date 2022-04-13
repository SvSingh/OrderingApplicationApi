package com.SvTech.SpringApi.repo;

import com.SvTech.SpringApi.models.OrdersOrderitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrdersOrderitem, Integer> {
}
