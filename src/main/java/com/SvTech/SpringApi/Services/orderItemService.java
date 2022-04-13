package com.SvTech.SpringApi.Services;

import com.SvTech.SpringApi.models.OrdersOrderitem;
import com.SvTech.SpringApi.repo.OrderItemRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class orderItemService {
    @Autowired
    OrderItemRepo orderItemRepo;


    @Transactional
    public OrdersOrderitem saveOrderItem(OrdersOrderitem orderItem){
        return orderItemRepo.save(orderItem);
    }
    public List<OrdersOrderitem> getOrderItems(Integer Orderid){
        List<OrdersOrderitem> result = new ArrayList<>();
        List<OrdersOrderitem> all = orderItemRepo.findAll();

        for (OrdersOrderitem ordersOrderitem : all) {
            if(ordersOrderitem.getOrderIdId() == Orderid) {
                result.add(ordersOrderitem);
            }
        }
        return result;
    }


    @Transactional
    public void deleteOrderItm(Integer id){
        orderItemRepo.deleteById(id);
    }


    public OrdersOrderitem getOrderItemByID(Integer id) {
        return orderItemRepo.getById(id);
    }
}
