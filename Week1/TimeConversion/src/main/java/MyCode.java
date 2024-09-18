package main.java;

public class MyCode {
    final static String DOCE = "12";
    final static String AM = "AM";
    final static String PM = "PM";

    public static String timeConversion(String s){
        String result = " ";
        if(s.contains(DOCE) && s.contains(PM)){
            result = "12:"+s.subSequence(3,8);
        } else if (s.contains(PM)) {
            int auxTime = (Integer.parseInt(s.subSequence(0,2).toString())+12 );
            result = String.format("%d:%s",auxTime, s.subSequence(3,8));
            
        } else if (s.contains(DOCE) && s.contains(AM)) {
            result = "00:"+s.subSequence(3,8);
            
        } else if (s.contains(AM)) {
            result = s.subSequence(0,8).toString();

        }
        return result;
    }
}
