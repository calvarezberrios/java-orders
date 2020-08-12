package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Customer;

import java.util.List;

public interface CustomerServices
{
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    Customer findById(Long id);

    List<Customer> findByNameLike(String subname);

}
