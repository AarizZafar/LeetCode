package Random;
import java.util.Arrays;

public class Shuffle_the_Array {

    public int[] shuffle(int[] nums, int n) {
        if (nums.length <= 2)
            return nums;

        int[] temp_array = new int[nums.length];

        int i = 0;
        int j = n;

        int pos = 0;
        while(j < 2*n){
            temp_array[pos++] = nums[i++];
            temp_array[pos++] = nums[j++];
        }
        return temp_array;
    }

    public static void main(String[] args) {
        Shuffle_the_Array test1 = new Shuffle_the_Array();
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;

        System.out.println(Arrays.toString(test1.shuffle(nums, n)));
    }
}
