package Random;
import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ptr1=0;ptr1<nums.length;ptr1++){
            int val = target - nums[ptr1];
            if(map.containsKey(val)) {
                if(map.get(val) == ptr1)
                    continue;
                return new int[] {ptr1,map.get(val)};
            }
            map.put(nums[ptr1],ptr1);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Two_Sum test1 = new Two_Sum();
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(test1.twoSum(nums,target)));
    }
}
