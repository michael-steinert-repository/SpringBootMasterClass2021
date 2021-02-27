package com.example.SpringBootMasterClass2021.customer;

import com.example.SpringBootMasterClass2021.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Customer with ID %s not found", id)));
    }
}
