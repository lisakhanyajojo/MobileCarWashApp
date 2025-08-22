package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }
@PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.create(customer);
}

@GetMapping("/read/{userId}")
    public Customer readCustomer(@PathVariable String userId) {
        return service.read(userId);
}

@PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return service.update(customer);
}

@RequestMapping("/delete/{userId}")
    public boolean deleteCustomer(@PathVariable String userId) {
        return service.delete(userId);
}

@GetMapping("/getall")
    public List<Customer> getAllCustomers() {
        return service.getAll();
}
}
