package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder result = new StringBuilder();
        int size = 4;
        int[][] table = new int[size][size];

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++){
                result.append(table[i-1][j-1] = i * j);
            }
        }
        return result.toString();
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
