package Random;
import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length <= 1)
            return nums;

        int lprod = 1;
        int rprod = 1;
        int[] lp = new int[nums.length];
        int[] rp = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            lprod = lprod * nums[i];
            rprod = rprod * nums[j];

            lp[i] = lprod;
            rp[j] = rprod;
        }
        
        nums[0] = rp[1];
        nums[nums.length - 1] = lp[nums.length - 2];

        for (int i = 1; i < nums.length -1 ; i++)
            nums[i] = lp[i - 1] * rp[i + 1];

        return nums;
    }

    public static void main(String[] args) {
        Product_of_Array_Except_Self test1 = new Product_of_Array_Except_Self();
        int[] nums = { 1,2,3,4 };
        System.out.println(Arrays.toString(test1.productExceptSelf(nums)));

    }

}
