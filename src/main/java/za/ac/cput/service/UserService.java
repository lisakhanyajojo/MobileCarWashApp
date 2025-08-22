//package za.ac.cput.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.AdminManager;
//import za.ac.cput.domain.User;
//import za.ac.cput.repository.UserRepository;
//
//import java.util.List;
//
//@Service
//public class UserService implements IUserService{
//
//    private UserRepository repository;
//    @Autowired
//    public UserService(UserRepository  repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public User create(User user) {
//        return this.repository.save(user);
//    }
//
//    @Override
//    public User save(User user) {
//        return this.repository.save(user);
//    }
//
//    @Override
//    public User read(String id) {
//        return this.repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public User update(User user) {
//        return this.repository.save(user);
//    }
//
//    @Override
//    public boolean delete(String id) {
//        this.repository.deleteById(id);
//        return true;
//    }
//
//    public List<User> findAll() {
//        return repository.findAll();
//    }
//    @Override
//    public List<User> findByUserId(String userId) {
//        return List.of();
//    }
//}
