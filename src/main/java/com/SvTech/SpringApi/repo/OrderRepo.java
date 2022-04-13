package com.SvTech.SpringApi.repo;

import com.SvTech.SpringApi.models.OrdersOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo  extends JpaRepository<OrdersOrder, Integer> {
}
