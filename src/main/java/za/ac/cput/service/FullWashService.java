package za.ac.cput.service;

import za.ac.cput.Repository.FullWashRepository;
import za.ac.cput.Repository.IFullWashRepository;
import za.ac.cput.domain.FullWash;

import java.util.ArrayList;
import java.util.List;

public class FullWashService implements IFullWashService {
     static IFullWashService ServiceRepo ;

     IFullWashRepository repository;
   //  List<FullWash>fullWashServiceList;

     FullWashService(){
         repository = FullWashRepository.createRepository();
     }

     public static IFullWashService getServiceRepo(){
         if(ServiceRepo == null){
             ServiceRepo = new FullWashService();
         }

         return ServiceRepo;
     }
    @Override
    public FullWash create(FullWash t) {
        return this.repository.create(t);
    }

    @Override
    public FullWash read(String serviceId) {
         return this.repository.read(serviceId);
    }

    @Override
    public FullWash update(FullWash t) {
        return this.repository .update(t);
    }
    @Override
    public List<FullWash> getAll() {
        return this.repository.getAll();
    }
    //add more customized full wash functionality

}
