package org.example.thuchanhjdbc1.model.service;

import org.example.thuchanhjdbc1.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    // Bieu dien logic nghiep vu
    private static Map<Integer, Customer> customerMap = new HashMap<>();
    static {
        customerMap.put(1,new Customer("Le Dang Phap", "03/05/1998", "SGN"));
        customerMap.put(2,new Customer("Huynh Tran Thanh Dung", "21/05/1996", "HN"));
    }

    public List<Customer> findAll(){
        return new ArrayList<>(customerMap.values());
    }
}
