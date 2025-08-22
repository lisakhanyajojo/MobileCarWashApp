package za.ac.cput.service;

import za.ac.cput.domain.User;

public interface IService<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}

