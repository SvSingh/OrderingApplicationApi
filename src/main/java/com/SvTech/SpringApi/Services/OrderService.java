package com.SvTech.SpringApi.Services;

import com.SvTech.SpringApi.models.OrdersOrder;
import com.SvTech.SpringApi.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    public List<OrdersOrder> getAllOrders(){
        return orderRepo.findAll();
    }

    public OrdersOrder getOrderbyID(Integer id){
        return orderRepo.findById(id).get();
    }
    public List<OrdersOrder> getOrderbyCustomID(Integer id){
        List<OrdersOrder> result = new ArrayList<>();

        List<OrdersOrder> allOrders = orderRepo.findAll();
        for (OrdersOrder allOrder : allOrders) {
            if(allOrder.getCutomerNameId() == id){
                result.add(allOrder);
            }
        }
        return result;

    }
    @Transactional
    public OrdersOrder saveOrder(OrdersOrder order){
        return orderRepo.save(order);
    }
    @Transactional
    public void deleteOrder(Integer id){
        orderRepo.deleteById(id);
    }
}
