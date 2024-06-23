package com.company;

public class Exceptions {
    public static void main(String args[]){

        try{

            try{

                try{
                    int a[]={2,3,4,5};
                    System.out.println(a[9]);
                }
                catch (ArithmeticException e){
                    System.out.println(e);
                    System.out.println("handling 1st exception");
                }
            }
            catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("handling 2nd exception");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Main try block");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Main!");
        }
    }
}
