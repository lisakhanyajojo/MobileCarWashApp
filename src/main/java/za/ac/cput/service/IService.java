package za.ac.cput.service;

public interface IService <Type  , id>{
    Type create (Type t);

    Type read( id serviceId);

    Type update(Type t);

}
