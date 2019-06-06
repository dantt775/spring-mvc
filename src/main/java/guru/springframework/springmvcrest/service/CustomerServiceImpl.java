package guru.springframework.springmvcrest.service;

import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerbyId(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> findAllCustomers() {

        return customerRepository.findAll();
    }
}
