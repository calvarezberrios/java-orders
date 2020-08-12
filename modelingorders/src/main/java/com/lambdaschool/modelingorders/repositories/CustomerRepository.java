package com.lambdaschool.modelingorders.repositories;

import com.lambdaschool.modelingorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findByCustnameContainingIgnoringCase(String subname);
}
