package com.SvTech.SpringApi.controller;


import com.SvTech.SpringApi.Services.orderItemService;
import com.SvTech.SpringApi.models.OrdersOrderitem;
import com.SvTech.SpringApi.repo.OrderItemRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orderitem")
public class OrderitemController {
@Autowired
    private orderItemService orderItemService;

    @GetMapping("{id}")
    public List<OrdersOrderitem> getOrderItems(@PathVariable Integer id){
        return orderItemService.getOrderItems(id);

    }

    @PostMapping("")
        public OrdersOrderitem saveOrderItem(OrdersOrderitem orderitem){
            return orderItemService.saveOrderItem(orderitem);
        }

    @PutMapping("{id}")
        public OrdersOrderitem changeOrderItem(OrdersOrderitem orderItem, @PathVariable Integer id){
        OrdersOrderitem existOrderItem = orderItemService.getOrderItemByID(id);
        orderItem.setId(existOrderItem.getId());
        return  orderItemService.saveOrderItem(orderItem);
    }

    @DeleteMapping("")
        public void deleteOrderItem (Integer id){
        orderItemService.deleteOrderItm(id);
    }



}
