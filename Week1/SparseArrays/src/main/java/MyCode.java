package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyCode {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        List<Integer> results = queries.stream().map( q -> Collections.frequency(strings,q)).toList();
        return results;
    }


    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
//adding queries[] values to a hashmap
        for( int i=0; i<queries.size(); i++){
            if(!map.containsKey(queries.get(i))){
                map.put(queries.get(i),0);
            }
        }

//incrementing the queries with those found
        for ( int j=0; j<strings.size();j++){
            if (map.containsKey(strings.get(j))){
                map.put( strings.get(j), map.get(strings.get(j))+1 );
            }
        }


// traversed queries, searched map for the value, added the value to the result list
        List<Integer> res = new ArrayList<Integer>();
        for (int k=0; k < queries.size(); k++){
            if (map.containsKey(queries.get(k))){
                res.add(map.get(queries.get(k)));
            } else {
                res.add(0);
            }
        }
        return res;
    }
}
