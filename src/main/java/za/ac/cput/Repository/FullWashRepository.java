package za.ac.cput.Repository;

import za.ac.cput.domain.FullWash;

import java.util.ArrayList;
import java.util.List;

public class FullWashRepository implements IFullWashRepository{
    private static IFullWashRepository repository = null;
    private List<FullWash> fullWashList;

    private FullWashRepository(){
        fullWashList = new ArrayList<>();
    }

    public static IFullWashRepository  createRepository(){
         if(repository == null){
             repository =  new FullWashRepository();
         }

        return repository;
    }

    @Override
    public FullWash create(FullWash t) {
        boolean success = fullWashList.add(t);
        if(success){
            return t;
        }
        return null;
    }


    @Override
    public FullWash read(String serviceId) {
        for(FullWash r : fullWashList){
            if(r.getServiceId().equals(serviceId))
                return r;
        }
        return null;
    }

    @Override
    public FullWash update(FullWash t) {
        String id = t.getServiceId();
          FullWash fullWash = read(id);

          if(fullWash == null)
              return  null;
          boolean success = delete(id);
          if(success){
              if (fullWashList.add(fullWash))
                  return  fullWash;
          }
          return null;
    }

    @Override
    public boolean delete(String serviceId) {
        FullWash fullWashToDelete = read(serviceId);
        if(fullWashToDelete == null){
            return false;
        }

        return (fullWashList.remove(fullWashToDelete));

    }




    @Override
    public List<FullWash> getAll() {
        return fullWashList;
    }
}
