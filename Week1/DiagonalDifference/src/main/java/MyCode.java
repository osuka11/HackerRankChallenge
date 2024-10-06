package main.java;

import java.util.List;

public class MyCode {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < arr.size();i++){
            firstSum += arr.get(i).get(i);
            secondSum += arr.get((arr.size()-1)-i).get(i);
        }
        return Math.abs(firstSum-secondSum);
    }
}
