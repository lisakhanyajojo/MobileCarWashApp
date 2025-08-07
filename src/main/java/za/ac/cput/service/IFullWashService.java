package za.ac.cput.service;

import za.ac.cput.domain.FullWash;

import java.util.List;

public interface IFullWashService extends IService <FullWash , String>{
    List<FullWash> getAll();
}
