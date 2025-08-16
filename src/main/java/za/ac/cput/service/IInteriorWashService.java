package za.ac.cput.service;

import za.ac.cput.domain.InteriorWash;

import java.util.List;

public interface IInteriorWashService extends IService<InteriorWash, String> {

    public List<InteriorWash> getAllInteriorList();

}
