package Random;
import java.util.Arrays;

public class Find_the_Duplicate_Number {

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            nums[nums[i] % nums.length] = nums[nums[i] % nums.length] + nums.length;

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 2 * nums.length)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Find_the_Duplicate_Number test1 = new Find_the_Duplicate_Number();
        int[] nums = { 3, 2, 1, 4, 1 };
        System.out.println(test1.findDuplicate(nums));
    }
}
// METHOD 2
// public int findDuplicate(int[] nums) {
// boolean[] temp_array = new boolean[nums.length];
// System.out.println(Arrays.toString(temp_array));

// for(int n : nums){
// if(temp_array[n])
// return n;

// temp_array[n] = true;
// }
// return -1;
// }

/*
 * nums.length = 5
 * 
 * | - - - | - - - - |
 * 1 5 10
 * 
 * 
 * - - - - - - |
 * 7
 * 
 * - - - - - - - - - - - - |
 * 13
 * 
 * 2
 * 5 + 2 = 7
 * 
 * 3,3
 * 5 + 3 = 8
 * 8 + 5 = (13)
 * 
 * repeated value > 10
 * non - repeated value = 5 - 10
 */
