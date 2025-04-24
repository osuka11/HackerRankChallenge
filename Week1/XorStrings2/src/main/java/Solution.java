package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static char convertToXor(char a, char b){
        if( a != b){
            return '1';
        }else{
            return '0';
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String r = " ";

        for( int i = s1.length()-1; i>= 0; i--){
            r += Solution.convertToXor(s1.charAt(i), s2.charAt(i));
        }
        System.out.println();



    }
}
