//package za.ac.cput.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.domain.AdminManager;
//import za.ac.cput.service.AdminManagerService;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("MobileCarWashApp/adminManagerService")
//public class AdminManagerController {
//
//    private final AdminManagerService service;
//
//    @Autowired
//    public AdminManagerController(AdminManagerService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/create")
//    public AdminManager create(@RequestBody AdminManager admin) {
//        return service.create(admin);
//    }
//
//    @GetMapping("/read/{adminManagerId}")
//    public AdminManager read(@PathVariable String   adminManagerId) {
//        return service.read(adminManagerId);
//    }
//
//    @PutMapping("/update")
//    public AdminManager update(@RequestBody AdminManager admin) {
//        return service.update(admin);
//    }
//
//    @DeleteMapping("/delete/{adminManagerId}")
//    public boolean delete(@PathVariable String adminManagerId) {
//        return service.delete(adminManagerId);
//    }
//
//    @GetMapping("/findAll")
//    public List<AdminManager> findAll() {
//        return service.findAll();
//    }
//}
