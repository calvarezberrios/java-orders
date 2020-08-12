package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Order;

import java.util.List;

public interface OrderServices
{
    Order save(Order order);

    Order findById(long id);

    List<Order> findWithAdvanceAmount();
}
