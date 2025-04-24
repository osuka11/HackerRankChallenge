package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyCode {
    List<Character> alphabet = Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    );
    public static String pangrams(String s) {
        List<Character> letters = new ArrayList<Character>();
        for (char letter : s.toLowerCase().toCharArray()){
            if(letter != ' '){
                letters.add(letter);
            }
        }
        if( (letters.stream().collect(Collectors.toSet()).size()) == 26){
            return "PANGRAM";
        } else {
            return "NOT PANGRAM";
        }
    }
}
