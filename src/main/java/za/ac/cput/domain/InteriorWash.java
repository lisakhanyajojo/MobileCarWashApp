package za.ac.cput.domain;

public class InteriorWash extends Service {
    private double engineCleaningIncludedPrice;
    private double vacuumingPrice;
    private String airFreshenerType;

    private double getIsEngineCleaningIncluded() {
        return engineCleaningIncludedPrice;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public double getEngineCleaningIncludedPrice() {
        return engineCleaningIncludedPrice;
    }

    public double getVacuumingPrice() {
        return vacuumingPrice;
    }

   public InteriorWash(Builder builder){
      this.vacuumingPrice = builder.vacuumingPrice;
      this.airFreshenerType = builder.airFreshenerTyp;
        this.engineCleaningIncludedPrice = builder.engineCleaningIncluded;
        this.nameOfService = builder.nameOfService;
        this.serviceId = builder.serviceId;
        this.price = builder.price;
        this.duration = builder.duration;
        this.descriptionOfService = builder.descriptionOfService;

    }

    @Override
    public String toString() {
        return "InteriorWash{" +
                "airFreshenerType='" + airFreshenerType + '\'' +
                ", engineCleaningIncludedPrice=" + engineCleaningIncludedPrice +
                ", vacuumingPrice=" + vacuumingPrice +
                ", descriptionOfService='" + descriptionOfService + '\'' +
                ", duration=" + duration +
                ", nameOfService='" + nameOfService + '\'' +
                ", price=" + price +
                ", serviceId=" + serviceId +
                '}';
    }

    public static class Builder {
        private double engineCleaningIncluded;
        private String serviceId;
        private String nameOfService;
        private String descriptionOfService;
        private double price;
        private double duration;
        private double vacuumingPrice;
        private String airFreshenerTyp;


        public Builder setDescriptionOfService(String descriptionOfService) {
            this.descriptionOfService = descriptionOfService;
            return this;
        }

        public Builder setAirFreshenerTyp(String airFreshenerTyp) {
            this.airFreshenerTyp = airFreshenerTyp;
            return  this;

        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setVacuumingPrice(double vacuumingPrice) {
            this.vacuumingPrice = vacuumingPrice;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder setNameOfService(String nameOfService) {
            this.nameOfService = nameOfService;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }



        public Builder setEngineCleaningIncluded(double engineCleaningIncluded) {
            this.engineCleaningIncluded = engineCleaningIncluded;
            return this;
        }




      public Builder copy(InteriorWash interiorWash){
            this.engineCleaningIncluded = interiorWash.engineCleaningIncludedPrice;
            this.serviceId = interiorWash.getServiceId();
            this.descriptionOfService = interiorWash.getDescriptionOfService();
            this.nameOfService = interiorWash.getNameOfService();
            this.price = interiorWash.getPrice();
            this.duration = interiorWash.getDuration();
            this.airFreshenerTyp = interiorWash.airFreshenerType;
            this.vacuumingPrice =  interiorWash.vacuumingPrice;
            return this;
        }

        public InteriorWash build(){
            return new InteriorWash(this);
        }
    }
}
