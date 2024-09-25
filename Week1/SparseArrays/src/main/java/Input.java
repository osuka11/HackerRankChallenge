package main.java;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringCounts = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> strings = IntStream.range(0,stringCounts).mapToObj( i->{
            try{
                return bufferedReader.readLine();
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        }).toList();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0,queriesCount).mapToObj( i->{
            try{
                return bufferedReader.readLine();
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        }).toList();

        List<Integer> res = MyCode.matchingStrings2(strings,queries);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"))
                +"\n"
        );

        bufferedReader.close();
        bufferedWriter.close();



    }
}
