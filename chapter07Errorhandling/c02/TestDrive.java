package com.tutorial.clean.code.chapter07Errorhandling.c02;

public class TestDrive {


    /*
        Checked exception atan bir yapıyı lambdalar ile kullanamayız.
     */

    static void stringConverter() throws RuntimeException {
        String test = null;
        test.toString();
    }


    public static void main(String[] args) {


        stringConverter();
        System.out.println("Hello");

    }

}
