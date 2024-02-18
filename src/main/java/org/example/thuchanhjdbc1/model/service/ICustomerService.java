package org.example.thuchanhjdbc1.model.service;

import org.example.thuchanhjdbc1.model.Customer;

import java.util.List;

public interface ICustomerService  {
    List<Customer> findAll();
    void save(Customer c);
}
