package com.lambdaschool.modelingorders.controllers;

import com.lambdaschool.modelingorders.models.Customer;
import com.lambdaschool.modelingorders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController
{
    @Autowired
    CustomerServices custService;

//    http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> getCustomersIncludingOrders()
    {
        List<Customer> customers = custService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

//    http://localhost:2019/customers/customer/7
    @GetMapping(value = "/customer/{custid}", produces = {"application/json"})
    public ResponseEntity<?> getCustomerById(@PathVariable long custid)
    {
        Customer customer = custService.findById(custid);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

//    http://localhost:2019/customers/namelike/mes
    @GetMapping(value = "/namelike/{subname}", produces = {"application/json"})
    public ResponseEntity<?> getCustomersByNameLike(@PathVariable String subname)
    {
        List<Customer> customers = custService.findByNameLike(subname);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}
