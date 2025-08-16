package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.service.AdminManagerService;

import java.util.List;

@RestController
@RequestMapping("/MobileCarWashApp/adminManager")
public class AdminManagerController {

    private  AdminManagerService service;

    @Autowired
    public AdminManagerController(AdminManagerService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public AdminManager create(@RequestBody AdminManager adminManager) {
        return service.create(adminManager);
    }

    @GetMapping("/read/{adminManagerId}")
    public AdminManager read(@PathVariable String adminManagerId) {
       return service.read(adminManagerId);
    }

    @PutMapping("/update")
    public AdminManager update(@RequestBody AdminManager adminManager) {
        return service.update(adminManager);
    }

    @DeleteMapping("/delete/{adminManagerId}")
    public boolean delete(@PathVariable String adminManagerId) {
      return service.delete(adminManagerId);
    }

    @GetMapping("/getall")
    public List<AdminManager> findAll() {
       return service.findAll();
    }
}
