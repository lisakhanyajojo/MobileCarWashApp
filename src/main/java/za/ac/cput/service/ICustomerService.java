package za.ac.cput.service;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.FullWash;

import java.util.List;

// ICustomerService.java
public interface ICustomerService extends IService<Customer, String> {
    List<Customer> getAll();
}

