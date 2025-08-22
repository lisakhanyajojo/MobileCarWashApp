//package za.ac.cput.Repository;
//
//import za.ac.cput.domain.Customer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Deprecated
//public class CustomerRepository implements ICustomerRepository {
//
//    private static ICustomerRepository repository = null;
//
//    private List<Customer> customerList;
//
//    private CustomerRepository() {
//        customerList = new ArrayList<Customer>();
//    }
//
//    public static ICustomerRepository getRepository() {
//        if (repository == null) {
//            repository = new CustomerRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Customer create(Customer t) {
//        boolean success = customerList.add(t);
//        if (success) {
//            return t;
//        }
//
//        return null;
//    }
//
//    @Override
//    public Customer read(Long customerId) {
//        for (Customer c : customerList) {
//            if (c.getCustomerId().equals(customerId))
//                return c;
//        }
//        return null;
//    }
//
//    @Override
//    public Customer update(Customer t) {
//        Long id = t.getCustomerId();
//        Customer existingCustomer = read(id);
//
//        if (existingCustomer == null)
//            return null;
//
//        boolean deleted = delete(id);
//        if (deleted) {
//            if (customerList.add(t))
//                return t;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean delete(Long customerId) {
//        Customer customerToDelete = read(customerId);
//        if (customerToDelete == null) {
//            return false;
//        }
//        return customerList.remove(customerToDelete);
//    }
//
//    @Override
//    public List<Customer> getAll() {
//        return customerList;
//    }
//}
//
