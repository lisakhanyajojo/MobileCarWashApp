package za.ac.cput.Repository;

import za.ac.cput.domain.FullWash;
import za.ac.cput.domain.InteriorWash;

import java.util.ArrayList;
import java.util.List;

public class InteriorWashRepository implements IInteriorWashRepository{
    private static InteriorWashRepository repo = null;
    List< InteriorWash> interiorWashList;

    InteriorWashRepository (){
        interiorWashList = new ArrayList<>();
    }

   public static InteriorWashRepository createRepo (){
        if(repo == null){
            repo = new InteriorWashRepository();
        }

        return repo;
   }
    @Override
    public InteriorWash create(InteriorWash t) {

        boolean success = interiorWashList.add(t);
        if(success){
            return  t;
        }
        return null;
    }

    @Override
    public InteriorWash read(String serviceId) {
            for (InteriorWash interiorWash : interiorWashList){
                if(interiorWash.getServiceId().equals(serviceId));
                return interiorWash;
            }
            return null;
    }

    @Override
    public InteriorWash update(InteriorWash t) {
       InteriorWash interiorWash = read(t.getServiceId());
        if(interiorWash == null)
            return null;
        boolean suc =  delete(t.getServiceId());
        if(suc) {
            interiorWashList.add(interiorWash);
        }
        return  null;
    }

    @Override
    public boolean delete(String serviceId) {

        InteriorWash interiorWash = read(serviceId);
        if(interiorWash == null){
            return false;
        }

         return   interiorWashList.remove(interiorWash);

    }
    @Override
    public List<InteriorWash> getAll() {
        return interiorWashList;
    }
}
