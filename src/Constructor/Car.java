package Constructor;

public class Car {
    // fields
    private int year;
    private String make;
    private String model;
    private String color;
    private String vehicleIdNo;

    // constructor
    public Car(int year, String make, String model, String color, String vehicleIdNo) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleIdNo = vehicleIdNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleIdNo() {
        return vehicleIdNo;
    }

    public void setVehicleIdNo(String vehicleIdNo) {
        this.vehicleIdNo = vehicleIdNo;
    }
}
