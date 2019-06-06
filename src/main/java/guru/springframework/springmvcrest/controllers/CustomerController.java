package guru.springframework.springmvcrest.controllers;


import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.service.CustomerService;
import org.apache.tomcat.jni.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerbyId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
