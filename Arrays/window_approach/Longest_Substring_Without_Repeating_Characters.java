package window_approach;
import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        HashSet<Character> set = new HashSet<>();
        int ptr1 = 0;

        for (int ptr2 = 0; ptr2 < s.length(); ptr2++) {
            if (set.contains(s.charAt(ptr2))) {
                while (s.charAt(ptr1) != s.charAt(ptr2)) {
                    set.remove(s.charAt(ptr1++));
                }
                set.remove(s.charAt(ptr1++));
            }
            set.add(s.charAt(ptr2));
            size = Math.max(size, set.size());
        }

        return size;
    }

    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters test1 = new Longest_Substring_Without_Repeating_Characters();
        System.out.println(test1.lengthOfLongestSubstring("agfrthjytzxcvbnm"));
    }
}



// f w h t e w t c v b n m r 
//           |p2 - > 
//           |p1 bring p1 to p2 as as w was in between as duplicate 
// ans = w t c v b n m r 
