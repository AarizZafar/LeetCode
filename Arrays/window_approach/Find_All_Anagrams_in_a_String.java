package window_approach;
import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    // simpler methord given down 

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexVals = new ArrayList<>();
        char[] ptoChar = p.toCharArray();
        int[] pArray = new int[26];

        for(char c : ptoChar)
            pArray[c - 'a']++;

        int ptr1 = 0;
        int[] sArray = new int[26];
        for(int ptr2=0;ptr2<s.length();ptr2++){
            int index = s.charAt(ptr2) - 'a';
            sArray[index]++;

            if(sArray[index] > pArray[index]){
                while(sArray[index] != pArray[index])
                    sArray[s.charAt(ptr1++) - 'a']--;
            }

            if(ptr2-ptr1+1 == p.length())
                indexVals.add(ptr1);
        }
        return indexVals;
    }

    public static void main(String[] args){
        Find_All_Anagrams_in_a_String test1 = new Find_All_Anagrams_in_a_String();
        String str = "cbaebabacd";
        String p = "abc";
        System.out.println(test1.findAnagrams(str, p));
    }
    
}

/* METHORD 2

create 2 arrays of length 26 for p and s -> string 
put the index of s string as 1 when adding an element and 0 when removing the element in the array
compare the both the array if the characters and frequeny are same add the index 

 * public List<Integer> findAnagrams(String s, String p) {
        List<Integer> index = new ArrayList<>();
        int SLength = s.length();
        int PLength = p.length();

        if(p.length() > s.length() || p.length() == 0)
            return index;

        int[] sArray = freqCount(s.substring(0,PLength));
        int[] pArray = freqCount(p);

        if(isEqual(sArray, pArray))
            index.add(0);

        for(int ptr2=PLength;ptr2<SLength;ptr2++){
            sArray[s.charAt(ptr2-PLength) - 'a']--;    // Remove element
            sArray[s.charAt(ptr2)-'a']++;              // Add element
            if(isEqual(sArray, pArray)){
                index.add(ptr2-PLength+1);
            }
        }
        return index;
    }

    public boolean isEqual(int[] sArray, int[] pArray){
        for(int i=0;i<sArray.length; i++){
            if(sArray[i] != pArray[i])
                return false;
        }
        return true;
    }

    public int[] freqCount(String str){
        int[] array = new int[26];
        for(int i=0;i<str.length();i++)
            array[str.charAt(i) - 'a']++;
        return array;
    }
 */



