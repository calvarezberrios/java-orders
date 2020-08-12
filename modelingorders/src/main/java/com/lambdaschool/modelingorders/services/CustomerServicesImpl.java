package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Customer;
import com.lambdaschool.modelingorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> customers = new ArrayList<>();
        custrepo.findAll().iterator().forEachRemaining(customers::add);
        return customers;
    }

    @Override
    public Customer findById(Long id)
    {
        return custrepo.findById(id)
                       .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " not found!"));
    }

    @Override
    public List<Customer> findByNameLike(String subname)
    {
        return custrepo.findByCustnameContainingIgnoringCase(subname);
    }
}
