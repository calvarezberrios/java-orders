package com.lambdaschool.modelingorders.repositories;

import com.lambdaschool.modelingorders.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long>
{
    @Query(value = "SELECT * FROM Orders JOIN Customers ON Orders.custcode = customers.custcode WHERE advanceamount > 0 ORDER BY advanceamount DESC", nativeQuery = true)
    List<Order> findWithAdvanceAmount();
}
