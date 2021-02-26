package com.example.SpringBootMasterClass2021.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/customer")
@RestController
@Deprecated
public class CustomerControllerV1 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV1(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    Customer getCustomer() {
        return null;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {

    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {

    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {

    }
}
