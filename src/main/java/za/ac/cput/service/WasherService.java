package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.Repository.IWasherRepository;
import za.ac.cput.domain.Washer;

import java.util.List;

@Service
public class WasherService implements IWasherService{
    private static IWasherService service;

    private static IWasherRepository repository;

    private WasherService(){

    }
    public static IWasherService getService(){
        if (repository == null) {
            service = new WasherService();
        }
        return service;

    }

    @Override
    public Washer create(Washer washer) {
        return this.repository.create(washer);
    }

    @Override
    public Washer read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Washer update(Washer washer) {

        return this.repository.update(washer);
    }

//    @Override
//    public boolean delete(String id) {
//
//        return this.repository.delete(id);
//    }

    @Override
    public List<Washer> getAll() {
        return this.repository.getAll();
    }

}
