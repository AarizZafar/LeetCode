package Random;
import java.util.*;

public class sum3 {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i-1] != nums[i])
                two_Sum(nums, i + 1, nums.length - 1, 0 - nums[i]);
        }
        return list;
    }

    public void two_Sum(int[] nums, int left, int right, int target) {
        int start_val = nums[left - 1]; // this variable has to be kept because the left value keeps changing in the while loop
        while (left < right) {
            if (nums[left] + nums[right] > target)
                right--;
            else if (nums[left] + nums[right] < target)
                left++;
            else {
                List<Integer> triplets = new ArrayList<Integer>();
                triplets.add(start_val);
                triplets.add(nums[left]);
                triplets.add(nums[right]);
                list.add(triplets);

                while (left < right && nums[left + 1] == nums[left]) 
                    left++;

                while (left < right && nums[right - 1] == nums[right])
                    right--;

                left++;
                right--;
            }
        }
    }
    

    public static void main(String[] args) {
        sum3 test1 = new sum3();
        int[] nums = { 0, 0, 0, 0 };
        System.out.println(test1.threeSum(nums));
    }
}

