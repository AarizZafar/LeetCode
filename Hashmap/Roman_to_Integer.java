package Hashmap;

import java.util.HashMap;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<Character,Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };

        int number = 0;
        for(int i=0;i<s.length();i++) {
            if(i > 0 && values.get(s.charAt(i-1)) < values.get(s.charAt(i)))
                number += values.get(s.charAt(i)) - 2*values.get(s.charAt(i-1));
            else
                number += values.get(s.charAt(i));
        }
        return number;
    }

    public static void main(String[] args) {
        Roman_to_Integer test1 = new Roman_to_Integer();
        String s = "MCMXCIV";
        System.out.println(test1.romanToInt(s));
    }
}
