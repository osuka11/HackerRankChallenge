package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MyCode {
    public static void minMaxSum(List<Integer> arr ){
        Collections.sort(arr);
        List<Long> arrLong = arr.stream().map(Integer::longValue).collect(Collectors.toList());
        long maxSum = (arrLong.stream().reduce(1L, (a,b) -> a + b )) - arrLong.get(0);
        long minSum = (arrLong.stream().reduce(1L, (a, b) -> a+b )) - arrLong.get(arrLong.size()-1);
        System.out.println(maxSum + " " + minSum);
    }

}
