package za.ac.cput.Repository;

import za.ac.cput.domain.InteriorWash;

import java.util.List;

public interface IInteriorWashRepository extends IRepository<InteriorWash, String>{

    List<InteriorWash> getAll();
}
