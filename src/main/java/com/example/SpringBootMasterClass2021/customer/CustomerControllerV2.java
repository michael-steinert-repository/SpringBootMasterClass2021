package com.example.SpringBootMasterClass2021.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v2/customers")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping
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
