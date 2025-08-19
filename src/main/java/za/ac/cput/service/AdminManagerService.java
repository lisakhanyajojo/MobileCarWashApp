package za.ac.cput.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.repository.AdminManagerRepository;

import java.util.List;

@Service
  public class AdminManagerService implements IAdminManagerService {

    private final AdminManagerRepository repository;

    @Autowired
    public AdminManagerService(AdminManagerRepository repository) {
        this.repository = repository;
    }

    @Override
    public AdminManager create(AdminManager admin) {
        return repository.save(admin);
    }

    @Override
    public AdminManager save(AdminManager admin) {
        return repository.save(admin);
    }

    @Override
    public AdminManager read(String userId) {
        return repository.findById(userId).orElse(null);
    }

    @Override
    public AdminManager update(AdminManager admin) {
        return repository.save(admin);
    }

    @Override
    public boolean delete(String userId) {
        this.repository.deleteById(userId);
        return true;
    }


    public List<AdminManager> findAll() {
        return repository.findAll();
    }



    }



