package Random;
public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if (nums.length < 1)
            return 1;

        nums[index++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                nums[index++] = nums[i];
        }
        // System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array test1 = new Remove_Duplicates_from_Sorted_Array();
        int[] nums = { 0, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        System.out.println(test1.removeDuplicates(nums));
    }
}

/*     ALTERNATIVE SOLUTION

 *     public int removeDuplicates(int[] nums) {
        int index = 0;
        for( int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]) 
                nums[++index] = nums[i];
        }
        return index+1;
    }

 */

