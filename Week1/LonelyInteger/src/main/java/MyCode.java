package main.java;

import java.util.List;

public class MyCode {


    public static int lonelyInteger(List<Integer> a) {
        int lonely = a.stream().filter( i-> a.stream().filter(it -> it == i ).count() == 1 ).toList().get(0);
        return lonely;
    }
}
