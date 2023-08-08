package Random;
public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {

    public int differenceOfSum(int[] nums) {
        if(nums.length <= 1)
            return nums[0];

        int arr_sum = 0;
        int dig_sum = 0;

        for(int num : nums){
            arr_sum += num;
            while(num > 0){
                int rem = num%10;
                dig_sum += rem;
                num = num/10;
            }
        }
        return Math.abs(arr_sum - dig_sum);
    }
    public static void main(String[] args){
        Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array test1 = new Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array();
        int[] nums = {1,2,3,4};

        System.out.println(test1.differenceOfSum(nums));

    }
    
}
