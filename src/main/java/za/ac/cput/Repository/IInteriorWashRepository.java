package za.ac.cput.Repository;

import za.ac.cput.domain.InteriorWash;


import java.util.List;

public interface IInteriorWashRepository extends za.ac.cput.repository.IRepository<InteriorWash, String> {

    List<InteriorWash> getAll();
}
