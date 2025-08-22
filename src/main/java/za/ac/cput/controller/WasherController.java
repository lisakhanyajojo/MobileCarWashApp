package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Washer;
import za.ac.cput.service.WasherService;

import java.util.List;

@RestController
@RequestMapping("/washer")

public class WasherController{

    private WasherController servive;

    @Autowired
    public WasherController(WasherController service){
        this.servive = service;
    }

    @PostMapping("/create")
    public Washer createWasher(@RequestBody Washer washer) {
        return servive.createWasher(washer);
    }

    @GetMapping("/read/{washerId}")
    public Washer read(@PathVariable String washerId) {
        return servive.read(washerId);
    }

    @PutMapping("update")
    public Washer updateWasher(@RequestBody Washer washer) {
        return servive.updateWasher(washer);
    }

    @RequestMapping("/delete/{washerId}")
    public boolean deleteWasher(@PathVariable String washerId) {
        return servive.deleteWasher(washerId);
    }


    @GetMapping("/all")
    public List<Washer> getAll() {
        return servive.getAll();
    }

}