package main.java;

import java.util.List;

public class MyCode {
    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int n = s.size();
        for( int i = 0; i <= n-m;i++ ){
            List<Integer> list = s.subList(i,m+i);
            if((sumList(list)) == d ){
                count++;
            }

        }
        return count;
    }

    private static int sumList(List<Integer> list) {
        int sum = 0;
        for(int element: list){
            sum += element;
        }
        return sum;
    }

}
