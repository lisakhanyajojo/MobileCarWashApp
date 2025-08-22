package za.ac.cput.Repository;

import za.ac.cput.domain.Washer;

import java.util.ArrayList;
import java.util.List;

public class WasherRepository implements IWasherRepository {
    public static IWasherRepository repository = null;

    private List<Washer> washerList;

    private WasherRepository() {
        washerList =  new ArrayList<>();
    }


    public static IWasherRepository getRepository() {
        if (repository == null) {
            repository = new WasherRepository();
        }
        return repository;
    }



    @Override
    public Washer create(Washer washer) {
        // Implementation for creating a new washer
        boolean success = washerList.add(washer);
        if (success) {
            return washer;                               // Return the created washer if added successfully
        }
        return null;                                    // Placeholder return statement
    }

    @Override
    public Washer read(String washerId) {
        for (Washer washer : washerList) {
            if (washer.getWasherId().equals(washerId)) {
                return washer; // Return the washer if found
            }
        }

        return null; // Placeholder return statement
    }

    @Override
    public Washer update(Washer washer) {
        String washerId = washer.getWasherId();
        Washer existingWasher = read(washerId);

        if (existingWasher == null)
            return null; // Return null if the washer does not exist

        boolean success = delete(washerId);
        if (success) {
            washerList.add(washer); // Add the updated washer to the list
            return washer;          // Return the updated washer
        }
            return null;
    }

    @Override
    public boolean delete(String id) {
        Washer washerToDelete = read(id);
        if (washerToDelete == null)
            return false; // Return true if deletion was successful

        return (washerList.remove(washerToDelete)); // Placeholder return statement
    }


    @Override
    public List<Washer> getAll() {

        return washerList; // Placeholder return statement
    }


}
