package window_approach;
import java.util.HashMap;

public class Maximum_Erasure_Value {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int score = 0;

        for (int ptr1 = 0, ptr2 = 0; ptr2 < nums.length; ptr2++) {
            if (map.get(nums[ptr2]) == 1) {
                while (nums[ptr1] != nums[ptr2]) {

                }
                max += nums[ptr2];
                map.put(nums[ptr2], map.getOrDefault(nums[ptr2], 0) + 1);
                score = Math.max(score, max);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Maximum_Erasure_Value test1 = new Maximum_Erasure_Value();
        int[] nums = { 4, 2, 4, 5, 6 };
        System.out.println(test1.maximumUniqueSubarray(nums));
    }

}
