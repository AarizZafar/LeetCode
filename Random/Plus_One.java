package Random;
import java.util.*;

public class Plus_One {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length - 1;i>=0;i--){
            if(digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Plus_One test1 = new Plus_One();
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(test1.plusOne(digits)));        
    }
    
}
