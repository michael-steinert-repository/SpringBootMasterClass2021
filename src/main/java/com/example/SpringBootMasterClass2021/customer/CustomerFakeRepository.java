package com.example.SpringBootMasterClass2021.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Michael", "test"),
                new Customer(2L, "Marie", "test"));
    }
}
