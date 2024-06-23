package com.company;

import java.util.logging.Logger;

public class LoopControl {
    private static Logger logger= Logger.getLogger("LoopControl.class");

    public static void main(String args[]){

        for(int i=0;i<10;i++)
        {
            if(i>5)
                break;
            logger.info("for loop printing Value of looping variable "+i);
        }

        int i=0;
        while(i<5)
            logger.info("while loop printing Value of looping variable "+(i++));

        i=0;
        do{
            logger.info("do while loop printing Value of looping variable "+(i++));
        }while(i<4);
    }
}
