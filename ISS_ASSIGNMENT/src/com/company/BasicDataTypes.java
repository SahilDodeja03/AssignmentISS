package com.company;

import java.util.logging.Logger;

public class BasicDataTypes {
    private static Logger logger= Logger.getLogger("Class.class");
    public static void main(String[] args) {

        byte byteValue = 127;
        logger.info("byteValue: " + byteValue);


        short shortValue = 32767;
        logger.info("shortValue: " + shortValue);


        int intValue = 10000;
        logger.info("intValue: " + intValue);


        long longValue = 10000000L;
        logger.info("longValue: " + longValue);


        float floatValue = 10.567366456768383f;
        logger.info("floatValue: " + floatValue);


        double doubleValue = 10.567366456768383d;
        logger.info("doubleValue: " + doubleValue);


        boolean booleanValue = false;
        logger.info("booleanValue: " + booleanValue);


        char charValue = 'z';
        logger.info("charValue: " + charValue);
    }

}