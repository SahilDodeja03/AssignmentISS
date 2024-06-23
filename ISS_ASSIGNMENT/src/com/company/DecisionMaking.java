package com.company;

import java.util.logging.Logger;

public class DecisionMaking {
    private static Logger logger= Logger.getLogger("DecisionMaking.class");

    public static void main(String args[])
    {
        int number = 10;
        if (number > 0) {
            logger.info("1. Number is positive");
        }

        int number2 = -5;
        if (number2 > 0) {
            logger.info("2. Number is positive");
        } else {
            logger.info("2. Number is negative or zero");
        }


        int number3 = 0;
        if (number3 > 0) {
            logger.info("3. Number is positive");
        } else if (number3 < 0) {
            logger.info("3. Number is negative");
        } else {
            logger.info("3. Number is zero");
        }

        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }
        logger.info("4. Day is: " + dayName);

    }
}
