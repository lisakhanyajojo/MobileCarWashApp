package za.ac.cput.Repository;

import za.ac.cput.domain.FullWash;

public interface IRepository  <Type , id> {
    Type create (Type t);

    Type read( id serviceId);

    Type update(Type t);

    boolean delete(id serviceId);


}
