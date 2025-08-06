package za.ac.cput.factory;

import za.ac.cput.domain.FullWash;
import za.ac.cput.util.Helper;

public class FullWashFactory {

   public static FullWash createFullWash(   String serviceID, String nameOfService , String
                                         descriptionOfService , double Price, double duration,
                                         int extraTimeToWash , boolean underBodyWashIncluded){

if(Helper.isNullOrEmpty(nameOfService) || Helper.isNullOrEmpty(descriptionOfService) ||!Helper.isPriceDurationValid(Price)
|| !Helper.isPriceDurationValid(duration)){
    return null;
}


       return new FullWash.Builder().setAddedExtraTimeToWash(extraTimeToWash).setDescriptionOfService(descriptionOfService)
               .setDuration(duration).setIsUnderBodyWashIncluded(underBodyWashIncluded).setPrice(Price).setServiceID(serviceID).setNameOfService(nameOfService)
               .build();
   }
}
