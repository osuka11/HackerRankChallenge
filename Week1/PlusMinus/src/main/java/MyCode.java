package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MyCode {

    public static void plusMinus(List<Integer> arr){
        float positives = ((float) arr.stream().filter(v-> v >= 0 && v <= 100 ).count());
        float negatives = ((float) arr.stream().filter(v-> v <= 0 && v >= -100).count());
        float zeros = ((float) arr.stream().filter(v-> v == 0).count());

        System.out.printf("%.6f",positives);
        System.out.printf("%.6f",negatives);
        System.out.printf("%.6f",zeros);

        System.out.printf("%.6f",positives/arr.size());
        System.out.printf("%.6f",negatives/arr.size());
        System.out.printf("%.6f",zeros/arr.size());
    }
}
