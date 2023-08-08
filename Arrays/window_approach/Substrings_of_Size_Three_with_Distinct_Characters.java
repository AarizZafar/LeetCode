package window_approach;
public class Substrings_of_Size_Three_with_Distinct_Characters {
    public int countGoodSubstrings(String s) {
        int count = 0;

        if (s.length() < 2)
            return 0;

        for (int ptr1 = 0; ptr1 < s.length() - 2; ptr1++) {
            char c1 = s.charAt(ptr1);
            char c2 = s.charAt(ptr1 + 1);
            char c3 = s.charAt(ptr1 + 2);

            if (c1 != c2 && c1 != c3 && c3 != c2)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Substrings_of_Size_Three_with_Distinct_Characters test1 = new Substrings_of_Size_Three_with_Distinct_Characters();
        String s = "x";
        System.out.println(test1.countGoodSubstrings(s));

    }

}
