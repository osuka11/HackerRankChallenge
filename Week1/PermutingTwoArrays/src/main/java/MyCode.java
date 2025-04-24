package main.java;

import java.util.Collections;
import java.util.List;

public class MyCode {
    public static boolean isLower(int a, int b, int k) {
        return (a + b) < k;
    }
    public static String twoArrays(int k, List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        int n = a.size();
        for (int i = 0; i< a.size(); i++){
            if(isLower(a.get(i), b.get((n-1)-i), k)) return "NO";
        }
        return "YES";
    }
}
