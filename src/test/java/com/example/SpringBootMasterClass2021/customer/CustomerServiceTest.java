package com.example.SpringBootMasterClass2021.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {
    /* Unit-Test */
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        /* Given */
        Customer customer1 = new Customer(1L, "michael", "test", "michael@mail.example");
        Customer customer2 = new Customer(2L, "marie", "test", "marie@mail.example");
        List<Customer> customerList =Arrays.asList(customer1, customer2);
        customerRepository.saveAll(customerList);
        /* When */
        List<Customer> customerListFromService = customerService.getCustomers();
        /* Then */
        assertEquals(customerList.size(), customerListFromService.size());
    }

    @Test
    void getCustomer() {
        /* Given */
        Customer customer = new Customer(1L, "michael", "test", "michael@mail.example");
        customerRepository.save(customer);
        /* When */
        Customer customerFromService = customerService.getCustomer(1L);
        /* Then */
        assertEquals(customer.getId(), customerFromService.getId());
        assertEquals(customer.getName(), customerFromService.getName());
        assertEquals(customer.getPassword(), customerFromService.getPassword());
        assertEquals(customer.getEmail(), customerFromService.getEmail());
    }
}