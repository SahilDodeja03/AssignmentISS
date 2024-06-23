package com.company;

import java.util.logging.Logger;

public class FinalKeyword {
    private static Logger logger= Logger.getLogger("FinalKeyword.class");

    final String instanceVar = "final instance variable";

    public static final double PI = 3.14;

    public final void finalMethod() {
        System.out.println("Final method in FinalKeywordExample");
    }

    public static final class FinalClass {
        public void display() {
            System.out.println("Displaying from FinalClass");
        }
    }

    public static void main(String[] args) {

        final int localVar = 45;

        FinalKeyword obj = new FinalKeyword();
        logger.info("Final instance variable: " + obj.instanceVar);

        logger.info("Final static variable: " + FinalKeyword.PI);

        obj.finalMethod();

        System.out.println("Final local variable: " + localVar);

        FinalClass finalObj = new FinalClass();
        finalObj.display();
    }
}
