package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1,"tinh", "tinh@gmail.com", "da nang"));
        customerMap.put(2, new Customer(2, "my", "my@gmail.com", "quang nam"));
        customerMap.put(3, new Customer(3,"nguyen", "nguyen@gmail.com", "da nang"));
        customerMap.put(4, new Customer(4,"tho", "tho@gmail.com", "quang tri"));
        customerMap.put(5, new Customer(5,"thuan", "thuan@gmail.com", "da nang"));

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

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
