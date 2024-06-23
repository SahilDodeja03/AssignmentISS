package com.company;

import java.util.logging.Logger;

public class Arrays {
    private static Logger logger= Logger.getLogger("Arrays.class");
     public static void main(String args[])
     {
         int[] myArray;

         int[] myArray1 = new int[5];
         int[] myArray2 = {1, 2, 3, 4, 5};
         int[] myArray3 = new int[]{1, 2, 3, 4, 5};

         int firstElement = myArray2[0];
         logger.info("first element of second array: "+firstElement);

         int thirdElement = myArray2[2];
         logger.info("third element of second array: "+thirdElement);

         int[] numbers = {1, 2, 3, 4, 5};

         logger.info("Original first element: " + numbers[0]);
         numbers[0] = 10;
         logger.info("Modified first element: " + numbers[0]);

         System.out.println("Array elements using for loop:");
         for (int i = 0; i < numbers.length; i++) {
             System.out.println("Element at index " + i + ": " + numbers[i]);
         }

         System.out.println("Array elements using enhanced for loop:");
         for (int number : numbers) {
             System.out.println("Element: " + number);
         }
     }

}
