package za.ac.cput.domain;

public class FullWash extends Service {
    private boolean isUnderBodyWashIncluded;
    private int addedExtraTimeToWash;

    public boolean getIsUnderBodyWashIncluded() {
        return isUnderBodyWashIncluded;
    }

    public int getAddedExtraTimeToWash() {
        return addedExtraTimeToWash;
    }

    FullWash(Builder builder){

        this.isUnderBodyWashIncluded = builder.isUnderBodyWashIncluded;
        this.addedExtraTimeToWash = builder.addedExtraTimeToWash;
        this.nameOfService = builder.nameOfService;
        this.serviceId = builder.serviceId;
        this.price = builder.price;
        this.duration = builder.duration;
        this.descriptionOfService = builder.descriptionOfService;

    }

    @Override
    public String toString() {
        return "FullWash{" +
                "addedExtraTimeToWash=" + addedExtraTimeToWash +
                ", isUnderBodyWashIncluded=" + isUnderBodyWashIncluded +
                ", descriptionOfService='" + descriptionOfService + '\'' +
                ", duration=" + duration +
                ", nameOfService='" + nameOfService + '\'' +
                ", price=" + price +
                ", serviceId=" + serviceId +
                '}';
    }

    public static class Builder{
        private boolean isUnderBodyWashIncluded;
        private int addedExtraTimeToWash;
        private String serviceId;
        private String nameOfService;
        private String descriptionOfService;
        private double price;
        private double duration;


        public Builder setDescriptionOfService(String descriptionOfService) {
            this.descriptionOfService = descriptionOfService;
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


        public Builder setServiceID(String serviceID) {
            this.serviceId = serviceID;
            return this;
        }


        public Builder setIsUnderBodyWashIncluded(boolean isUnderBodyWashIncluded) {
            this.isUnderBodyWashIncluded = isUnderBodyWashIncluded;
            return this;
        }

        public Builder setAddedExtraTimeToWash(int addedExtraTimeToWash) {
            this.addedExtraTimeToWash = addedExtraTimeToWash;
            return this;
        }



       public Builder copy(FullWash fullWash){
            this.addedExtraTimeToWash = fullWash.addedExtraTimeToWash;
            this.isUnderBodyWashIncluded = fullWash.isUnderBodyWashIncluded;
            this.serviceId = fullWash.getServiceId();
            this.descriptionOfService = fullWash.getDescriptionOfService();
            this.nameOfService = fullWash.getNameOfService();
            this.price = fullWash.getPrice();
            this.duration = fullWash.getDuration();
            return this;
        }

        public FullWash build(){
            return new FullWash(this);
        }
    }
}

