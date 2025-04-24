package main.java;

import java.util.ArrayList;
import java.util.List;

public class MyCode {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> results = new ArrayList<>(100);
        for (int i = 0; i< 100; i++){
            results.add(0);
        }
        arr.stream().forEach(
                i-> results.set(i,results.get(i)+1)
        );
        return results;
    }
}
