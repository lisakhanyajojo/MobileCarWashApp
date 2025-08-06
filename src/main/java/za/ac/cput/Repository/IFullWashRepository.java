package za.ac.cput.Repository;

import za.ac.cput.domain.FullWash;

import java.util.List;

public interface IFullWashRepository extends IRepository <FullWash , String>{

    List<FullWash> getAll();
}
