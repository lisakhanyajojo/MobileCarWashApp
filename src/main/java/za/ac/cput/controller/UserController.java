package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.domain.User;
import za.ac.cput.service.AdminManagerService;
import za.ac.cput.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/MobileCarWashApp/userService")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @GetMapping("/read/{userId}")
    public User read(@PathVariable String userId) {
        return service.read(userId);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping("/delete/{userId}")
    public boolean delete(@PathVariable String userId) {
        return service.delete(userId);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }
}
