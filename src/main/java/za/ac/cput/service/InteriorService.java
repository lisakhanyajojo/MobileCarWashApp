package za.ac.cput.service;

import za.ac.cput.Repository.IInteriorWashRepository;
import za.ac.cput.Repository.InteriorWashRepository;
import za.ac.cput.domain.InteriorWash;

import java.util.List;

public class InteriorService implements IInteriorWashService {
    IInteriorWashRepository repo;

 static IInteriorWashService interiorServiceWashRepo;

    InteriorService (){
        repo = InteriorWashRepository.createRepo();
    }
    public static IInteriorWashService createServiceRepo(){
        if(interiorServiceWashRepo == null) {


            interiorServiceWashRepo = new InteriorService();
        }
        return interiorServiceWashRepo;
     }

    @Override
    public InteriorWash create(InteriorWash t) {
        return this.repo.create(t);
    }

    @Override
    public InteriorWash read(String serviceId) {
        return this.repo.read(serviceId);
    }

    @Override
    public InteriorWash update(InteriorWash t) {
        return this.repo.update(t);
    }
    @Override
    public List<InteriorWash> getAllInteriorList() {
        return repo.getAll();
    }
}
