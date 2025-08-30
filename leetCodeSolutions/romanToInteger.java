package leetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
       romanToInteger obj = new romanToInteger();
        String s1 = "III";
        String s2 = "IV";
        String s3 = "MCMXCIV";

        System.out.println(s1 + " = " + obj.romanNumber(s1));   // 3
        System.out.println(s2 + " = " + obj.romanNumber(s2));   // 4
        System.out.println(s3 + " = " + obj.romanNumber(s3));   // 1994
    }
    public int romanNumber(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result =0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            //check the next character.
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value; // subtract
            } else {
                result += value; // add
            }

        }
        return result;
    }
}
