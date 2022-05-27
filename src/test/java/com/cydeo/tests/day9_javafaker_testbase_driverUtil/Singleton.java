package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    // #1- create private constructor
    private Singleton(){ }

    // #2- crate private static String
    // prevent access and provide a getter method
    private static String word;

    // This utility method will return the "word"
    public static String getWord(){

        if (word==null){

            System.out.println("First time call. Word object is null." + "Assigning value to it now!");
            word = "something";

        }else {
            System.out.println("Word already has value.");
        }
        return word;
    }

}
