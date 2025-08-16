package za.ac.cput.service;

import za.ac.cput.domain.AdminManager;

import java.util.List;

public interface IAdminManagerService extends IService<AdminManager,String>{

    List<AdminManager> findByAdminManagerId(String adminManagerId);

}
