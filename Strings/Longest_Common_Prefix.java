package Strings;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        else if(strs.length == 1)
            return strs[0];

        // The String is sorted lexiographically
        Arrays.sort(strs);
        StringBuilder s = new StringBuilder("");
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        for(int i=0;i<firstString.length();i++){
            if(firstString.charAt(i) != lastString.charAt(i))
                return s.toString();
            s.append(firstString.charAt(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Longest_Common_Prefix test1 = new Longest_Common_Prefix();
        String[] str = {"flower","flo"};
        System.out.println(test1.longestCommonPrefix(str));  

    }
    
}
