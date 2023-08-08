package window_approach;
public class Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int ptr1 = 0;
        int a = 0, b = 0, c = 0;

        for (int ptr2 = 0; ptr2 < s.length(); ptr2++) {
            if (s.charAt(ptr2) == 'a')
                a += 1;
            else if (s.charAt(ptr2) == 'b')
                b += 1;
            else
                c += 1;
            while (a > 0 && b > 0 && c > 0) {
                count += s.length() - ptr2;

                if (s.charAt(ptr1) == 'a')
                    a -= 1;
                else if (s.charAt(ptr1) == 'b')
                    b -= 1;
                else
                    c -= 1;

                ptr1++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Number_of_Substrings_Containing_All_Three_Characters test1 = new Number_of_Substrings_Containing_All_Three_Characters();
        String str = "abcabc";

        System.out.println(test1.numberOfSubstrings(str));

    }

}
