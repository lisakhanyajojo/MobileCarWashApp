

package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Repository.ICustomerRepository;
import za.ac.cput.domain.Customer;
import java.util.List;


@Service
public class CustomerService implements ICustomerService {

    private final ICustomerRepository repository;

    @Autowired
    public CustomerService(ICustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public boolean delete(String id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
