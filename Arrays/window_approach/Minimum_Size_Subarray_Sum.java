package window_approach;
public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int size = len + 1;
        int ptr1 = 0;
        int sum = 0;

        for(int ptr2=0;ptr2<nums.length;ptr2++){
            sum += nums[ptr2];

            while(sum >= target){
                size = Math.min(size,ptr2-ptr1+1);
                sum -= nums[ptr1];
                ptr1++;
            }
        }   
        return size == len + 1 ? 0:size;
    }
    public static void main(String[] args){
        Minimum_Size_Subarray_Sum test1 = new Minimum_Size_Subarray_Sum();
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;

        System.out.println(test1.minSubArrayLen(target, nums));

    }
    
}
