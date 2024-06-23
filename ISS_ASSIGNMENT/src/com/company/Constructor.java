package com.company;

import java.util.logging.Logger;

public class Constructor {
    private static Logger logger= Logger.getLogger("Constructor.class");

    String carName;
    int mileage;
     Constructor()
     {
         carName="Hello";
         mileage=90;
     }

     Constructor(String carName)
     {
         this.carName=carName;
         mileage=77;
     }

     Constructor(int mileage)
     {
         this.mileage=mileage;
         carName="Heyy";
     }

     Constructor(String carName,int mileage)
     {
         this.carName=carName;
         this.mileage=mileage;
     }

     public void displayCarDetails(){
         logger.info("Car Name: " + this.carName);
         logger.info("Car mileage: " + this.mileage);
     }

    public static void main(String args[])
    {
        Constructor car1=new Constructor();
        Constructor car2=new Constructor("Fortuner");
        Constructor car3=new Constructor("Baleno",33);

        logger.info("Details of car 1");
        car1.displayCarDetails();

        logger.info("Details of car 2");
        car2.displayCarDetails();

        logger.info("Details of car 3");
        car3.displayCarDetails();

    }

}
