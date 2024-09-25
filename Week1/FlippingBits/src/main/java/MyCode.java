package main.java;

public class MyCode {
    public static long flippingBits(long n) {
        return ( ( (long)Math.pow(2,32) ) - 1 - n);
    }
}
