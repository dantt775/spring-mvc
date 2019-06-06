package guru.springframework.springmvcrest.service;

import guru.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {


    Customer findCustomerbyId(Long id);

    List<Customer> findAllCustomers();

}
