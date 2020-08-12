package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Order;
import com.lambdaschool.modelingorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Transactional
@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    OrderRepository ordrepo;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return ordrepo.save(order);
    }

    @Override
    public Order findById(long id)
    {
        return ordrepo.findById(id)
                      .orElseThrow(() -> new EntityNotFoundException("Order " + id + " not found!"));
    }

    @Override
    public List<Order> findWithAdvanceAmount()
    {
        return ordrepo.findWithAdvanceAmount();
    }
}
