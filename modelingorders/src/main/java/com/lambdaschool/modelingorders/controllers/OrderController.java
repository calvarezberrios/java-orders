package com.lambdaschool.modelingorders.controllers;

import com.lambdaschool.modelingorders.models.Order;
import com.lambdaschool.modelingorders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController
{
    @Autowired
    OrderServices orderService;

//    http://localhost:2019/orders/order/7
    @GetMapping(value = "/order/{orderid}", produces = {"application/json"})
    public ResponseEntity<?> getOrderById(@PathVariable long orderid)
    {
        Order order = orderService.findById(orderid);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

//    http://localhost:2019/orders/advanceamount
    @GetMapping(value = "/advanceamount", produces = {"application/json"})
    public ResponseEntity<?> getOrdersWithAdvanceAmount()
    {
        List<Order> orders = orderService.findWithAdvanceAmount();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

}
