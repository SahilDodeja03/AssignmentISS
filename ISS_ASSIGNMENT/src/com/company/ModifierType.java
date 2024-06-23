package com.company;

import java.util.logging.Logger;

public class ModifierType {
    private static Logger logger=Logger.getLogger("ModifierType.class");

    public static String publicStaticVar = "I am public variable";

    private String privateVar = "I am private variable";

    protected void protectedMethod() {
        logger.info("Protected method called");
    }

    void defaultMethod() {
        logger.info("Default method called");
    }

    public void accessPrivateVariable() {
        privateVar = "Changed within the class";
        logger.info("Private variable accessed: " + privateVar);
    }
    public static void main(String args[])
    {
        ModifierType example = new ModifierType();

        logger.info("Public static variable: " + ModifierType.publicStaticVar);

        example.protectedMethod();
        example.defaultMethod();

        example.accessPrivateVariable();
    }
}
