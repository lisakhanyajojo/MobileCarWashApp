//package za.ac.cput.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.Customer;
//import za.ac.cput.Repository.CustomerRepository;
//
//import java.util.List;
//
//
//
//@Service
//public class CustomerService implements ICustomerService {
//
//    private final CustomerRepository repository;
//
//    @Autowired
//    public CustomerService(CustomerRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public List<Customer> findByAddressId(Long id) {
//        return repository.findAll()
//                .stream()
//                .filter(c -> c.getAddress() != null && id.equals(c.getAddress().getId()))
//                .toList();
//    }
//
//    @Override
//    public List<Customer> getAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public Customer create(Customer customer) {
//        return repository.save(customer);
//    }
//
//    @Override
//    public Customer read(Long id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Customer update(Customer customer) {
//        if (repository.existsById(customer.getCustomerId())) {
//            return repository.save(customer);
//        }
//        return null;
//    }
//}
