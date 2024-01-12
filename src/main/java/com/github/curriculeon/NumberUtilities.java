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

        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i++){
            if(i % 2 == 1){
                result.append(i);
            }

        }
        return result.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i+=step){
            result.append(i*i);
        }

        return result.toString();
    }

    public static String getRange(int stop) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < stop; i++){
            result.append(i);
        }

        return result.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i++) {
            result.append(i);
        }

        return result.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i+=step) {
            result.append(i);
        }

        return result.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder result = new StringBuilder();

        for(int i = start; i < stop; i+=step) {
            result.append((int)Math.pow(i, exponent));
        }

        return result.toString();
    }
}
