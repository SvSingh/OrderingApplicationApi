package com.SvTech.SpringApi.controller;


import com.SvTech.SpringApi.Services.OrderService;
import com.SvTech.SpringApi.models.OrdersOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("")
    public List<OrdersOrder> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public OrdersOrder getOrderbyID(@PathVariable Integer id){
        return orderService.getOrderbyID(id);
    }

    @GetMapping("/customer/{id}")
        public List<OrdersOrder> getOrderbyCustomId(@PathVariable Integer id){
            return orderService.getOrderbyCustomID(id);
    }

    @PostMapping("")
        public OrdersOrder saveOrder(OrdersOrder order){
            return     orderService.saveOrder(order);
    }

    @PutMapping("{id}")
        public OrdersOrder changeOrder(OrdersOrder order, @PathVariable Integer id){
            OrdersOrder existOrder = orderService.getOrderbyID(id);
            order.setId(existOrder.getId());
            return orderService.saveOrder(order);
    }
    @DeleteMapping("")
        public String DeleteOrder(@PathVariable Integer id){
            orderService.deleteOrder(id);
            return "Delete";
    }


}
