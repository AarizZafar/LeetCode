package window_approach;
public class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        char[] s1CharArray = s1.toCharArray();

        int[] s1Array = new int[26];
        for (char c : s1CharArray)
            s1Array[c - 'a']++;

        int ptr1 = 0;
        int[] s2Array = new int[26];
        for (int ptr2 = 0; ptr2 < s2.length(); ptr2++) {
            int idx = s2.charAt(ptr2) - 'a';
            s2Array[idx]++;
            while (s2Array[idx] > s1Array[idx])
                s2Array[s2.charAt(ptr1++) - 'a']--;
            if (ptr2 - ptr1 + 1 == s1.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Permutation_in_String test1 = new Permutation_in_String();
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(test1.checkInclusion(s1, s2));
    }

}

/*
 * THE CONCEPT IS SAME AS FINDING THE ANAGRAMS IN A STRING INSTED OF ADDING THE
 * INDEX WE ARE RETURNING
 * TRUE IF WE FIND AN ANAGRAM OR AN PERMUTATION
 * 
 * public boolean checkInclusion(String s1, String s2) {
 * int S1length = s1.length();
 * int S2length = s2.length();
 * 
 * if(S1length > S2length)
 * return false;
 * 
 * int[] s1Array = frequencyCount(s1);
 * int[] s2Array = frequencyCount(s2.substring(0,S1length));
 * 
 * if(isEqual(s1Array,s2Array))
 * return true;
 * 
 * for(int ptr2=S1length;ptr2<S2length;ptr2++){
 * s2Array[s2.charAt(ptr2) - 'a']++; // include
 * s2Array[s2.charAt(ptr2-S1length) - 'a']--; // exclude
 * if(isEqual(s1Array, s2Array))
 * return true;
 * }
 * return false;
 * }
 * 
 * public int[] frequencyCount(String str){
 * int[] count = new int[26];
 * for(int i=0;i<str.length();i++)
 * count[str.charAt(i) - 'a']++;
 * return count;
 * }
 * 
 * public boolean isEqual(int[] s1Array, int[] s2Array) {
 * for(int i=0;i<s1Array.length;i++) {
 * if(s1Array[i] != s2Array[i])
 * return false;
 * }
 * return true;
 * }
 */
