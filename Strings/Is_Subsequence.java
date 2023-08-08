package Strings;

public class Is_Subsequence {
    // Method 1
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;

        int ptr1 = 0; 
        int ptr2 = 0;

        while(ptr2 < t.length()) {
            if(Character.compare(s.charAt(ptr1), t.charAt(ptr2)) == 0) 
                ptr1++;

            if(ptr1 == s.length())
                return true;

            ptr2++;
        }
        return false;
    }

    // Method 2 ------------------------------------------------------------
    public boolean isSubsequenceRecur(String s, String t) {
        StringBuilder str = new StringBuilder("");
        int i = 0;
        return checkSubsequence(str, s, t ,i);
    }

    public boolean checkSubsequence (StringBuilder str, String s, String t, int index) {
        if(index == t.length()) {
            if(s.equals(str.toString())) 
                return true;
            return false;
        }

        str.append(t.charAt(index));
        boolean temp1 = checkSubsequence(str, s, t,index+1);

        str.deleteCharAt(str.length() - 1);
        boolean temp2 = checkSubsequence(str, s, t,index+1);

        return temp1 || temp2;
    }

    public static void main(String[] args) {
        Is_Subsequence test1 = new Is_Subsequence();
        System.out.println(test1.isSubsequenceRecur("", "abcd"));
        System.out.println(test1.isSubsequence("", "abcd"));
        
    }
    
}

/*
 * use two pointer approach if the first pointer char matches the second pointer char then increment pointer 1 
 */


