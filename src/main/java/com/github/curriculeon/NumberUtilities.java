package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                result.append(i);
            }
        }
        return result.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
