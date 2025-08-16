package za.ac.cput.domain;


public abstract class  Service {

    protected String serviceId;
    protected String nameOfService;
    protected String descriptionOfService;
    protected double price;
    protected double duration;


    public String getDescriptionOfService() {
        return descriptionOfService;
    }

    public double getDuration() {
        return duration;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public double getPrice() {
        return price;
    }

    public String getServiceId() {
        return serviceId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "descriptionOfService='" + descriptionOfService + '\'' +
                ", service_id=" + serviceId +
                ", nameOfService='" + nameOfService + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }

}

