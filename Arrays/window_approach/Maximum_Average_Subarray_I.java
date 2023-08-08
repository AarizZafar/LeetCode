package window_approach;
public class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length <= 1)
            return nums[0];

        double average = Integer.MIN_VALUE;
        double sum = 0;
        int ptr1 = 0;

        for(int ptr2=0;ptr2<k;ptr2++)
            sum += nums[ptr2];
        average = Math.max(average,sum/k);

        for(int ptr2=k;ptr2<nums.length;ptr2++){
            sum += nums[ptr2] - nums[ptr1++];
            average = Math.max(average,sum/k);
        }
        return average;
    }


    public static void main(String[] args) {
        Maximum_Average_Subarray_I test1 = new Maximum_Average_Subarray_I();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(test1.findMaxAverage(nums, k));
        
    }
    
}
