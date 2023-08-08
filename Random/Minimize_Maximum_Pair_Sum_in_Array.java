package Random;
import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_in_Array {

    public int minPairSum(int[] nums) {
        int max = 0;
        int len = nums.length/2;
        Arrays.sort(nums);
        for(int i=0;i<len;i++)
            max = Math.max(max,nums[i] + nums[nums.length - 1 - i]); 
        return max;
    }

    public static void main(String[] args){
        Minimize_Maximum_Pair_Sum_in_Array test1 = new Minimize_Maximum_Pair_Sum_in_Array();
        int[] nums = {3,5,4,2,4,6};
        System.out.println(test1.minPairSum(nums));

    }
    
}
