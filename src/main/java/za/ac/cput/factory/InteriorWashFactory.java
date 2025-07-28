package za.ac.cput.factory;

import za.ac.cput.domain.FullWash;
import za.ac.cput.domain.InteriorWash;
import za.ac.cput.util.Helper;

public class InteriorWashFactory {
    public static InteriorWash createInteriorWash(int serviceID, String nameOfService , String
                                                  descriptionOfService , double Price, double duration
                                              ,String airFreshener , double vacuumingPrice){

        if(Helper.isNullOrEmpty(nameOfService) || Helper.isNullOrEmpty(descriptionOfService) ||!Helper.isPriceDurationValid(Price)
                || !Helper.isPriceDurationValid(duration) || Helper.isNullOrEmpty(airFreshener)
                || !Helper.isPriceDurationValid(vacuumingPrice)){
            return null;
        }


        return new InteriorWash.Builder().setDescriptionOfService(descriptionOfService)
                .setDuration(duration).setPrice(Price).setServiceID(serviceID).setNameOfService(nameOfService).setAirFreshenerTyp(airFreshener)
                .setVacuumingPrice(vacuumingPrice)
                .build();
    }
}
