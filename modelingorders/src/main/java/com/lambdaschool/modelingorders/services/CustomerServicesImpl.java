package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Customer;
import com.lambdaschool.modelingorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomerRepository custrepo;

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return custrepo.save(customer);
    }
}
