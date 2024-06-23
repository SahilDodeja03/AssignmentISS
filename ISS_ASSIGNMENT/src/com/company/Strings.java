package com.company;

import java.util.logging.Logger;

public class Strings {
    private static Logger logger= Logger.getLogger("Strings.class");
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");

        String concatResult = str1 + " - Concatenated";

        int length = str1.length();

        String substring1 = str1.substring(8);
        String substring2 = str1.substring(2, 7);

        boolean isEqual = str1.equals(str2);

        String modifiedStr = str1.replace('o', 'i');


        // Output results
        logger.info("Original String: " + str1);
        logger.info("Concatenated String: " + concatResult);
        logger.info("Length of String: " + length);
        logger.info("Substring from index 8: " + substring1);
        logger.info("Substring from index 2 to 7: " + substring2);
        logger.info("String comparison result: " + isEqual);
        logger.info("Modified String: " + modifiedStr);
    }
}
