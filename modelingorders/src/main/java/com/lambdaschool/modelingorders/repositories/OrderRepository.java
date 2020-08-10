package com.lambdaschool.modelingorders.repositories;

import com.lambdaschool.modelingorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
