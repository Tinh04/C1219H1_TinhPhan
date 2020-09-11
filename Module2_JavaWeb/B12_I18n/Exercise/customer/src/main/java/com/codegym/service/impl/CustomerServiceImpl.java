package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Tinh", "tinh@gmail.com", "da nang"));
        customerMap.put(2, new Customer(2, "My", "my@gmail.com", "quang nam"));
        customerMap.put(3, new Customer(3, "Nguyen", "nguyen@gmail.com", "da nang"));
        customerMap.put(4, new Customer(4, "Tho", "tho@gmail.com", "quang tri"));
        customerMap.put(5, new Customer(5, "Thuan", "thuan@gmail.com", "da nang"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

}
