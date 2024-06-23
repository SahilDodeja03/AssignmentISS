package com.company;
import java.util.logging.Logger;
public class VariableType {
    private static Logger logger= Logger.getLogger("Class.class");
    static String staticVar="I am Static";
    String instVar;
    public VariableType(String instVar)
    {
        this.instVar=instVar;
    }

    public void displayVariables() {
        // Local variable
        String localVar = "I am block/local variable";

        logger.info("Local Variable: " + localVar);
        logger.info("Instance Variable: " + this.instVar);
        logger.info("Static Variable: " + staticVar);
    }

    public static void main(String args[])
    {
        VariableType variableType1=new VariableType("I am first instance variable");
        VariableType variableType2=new VariableType("I am Second instance variable");

        logger.info("Displaying first Variable");
        variableType1.displayVariables();

        VariableType.staticVar="I am changed static variable";

        logger.info("Displaying second Variable after changing the value of static variable");
        variableType2.displayVariables();



    }

}
