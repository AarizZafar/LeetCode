package Strings;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String haystack, String needle) {
        int index = -1;
        int len = needle.length();
        for(int i=0;i<haystack.length()-len+1;i++) {
            System.out.println(haystack.substring(i,i+len));
            if(haystack.substring(i,i+len).equals(needle))
                return i;
        }
        return index;
    }
    public static void main(String[] args) {
        Find_the_Index_of_the_First_Occurrence_in_a_String test1 = new Find_the_Index_of_the_First_Occurrence_in_a_String();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(test1.strStr(haystack, needle));
    }
    
}
