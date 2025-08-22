package za.ac.cput.Repository;

import za.ac.cput.domain.Customer;

import java.util.List;

public interface ICustomerRepository extends za.ac.cput.repository.IRepository<Customer,Long> {

    List<Customer> getAll();
}
