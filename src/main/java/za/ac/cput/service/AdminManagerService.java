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
    public AdminManager create(AdminManager adminManager) {
        return this.repository.save(adminManager);
    }

    @Override
    public AdminManager save(AdminManager adminManager) {
        return this.repository.save(adminManager);
    }

    @Override
    public AdminManager read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public AdminManager update(AdminManager adminManager) {
        return this.repository.save(adminManager);
    }

    @Override
    public boolean delete(String id) {
        this.repository.deleteById(id);
        return true;
    }


    public List<AdminManager> findAll() {
        return repository.findAll();
    }


    @Override
    public List<AdminManager> findByAdminManagerId(String adminManagerId) {
        return List.of();
    }
}


