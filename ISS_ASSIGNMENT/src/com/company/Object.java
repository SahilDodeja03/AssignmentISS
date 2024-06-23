package com.company;
import java.util.logging.Logger;
class Car{
    private static Logger logger= Logger.getLogger("Car.class");

    String carName;
    int mileage;

    public Car( String carName,int mileage) {
        this.carName=carName;
        this.mileage=mileage;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void displayCarDetails() {
        logger.info("Car Name: " + this.getCarName());
        logger.info("Car mileage: " + this.getMileage());
    }
}

public class Object {
    private static Logger logger= Logger.getLogger("Object.class");
    public static void main(String args[])
    {
        Car car1=new Car("Dzire",25);
        Car car2=new Car("Fortuner",17);
        Car car3=new Car("Baleno",33);

        logger.info("Details of car 1");
        car1.displayCarDetails();

        logger.info("Details of car 2");
        car2.displayCarDetails();

        logger.info("Details of car 3");
        car3.displayCarDetails();

    }

}
