package window_approach;
public class Longest_Subarray_of_ones_s_After_Deleting_One_Element {
    public int longestSubarray(int[] nums) {
        int Msize = 0;
        int max = 0;
        int ptr1 = 0;
        int zeroCount = 0;

        for(int ptr2 = 0;ptr2<nums.length;ptr2++) {
            if(nums[ptr2] == 0)
                zeroCount++;
            max++;

            while(zeroCount>1){
                if(nums[ptr1] == 0)
                    zeroCount--;
                max--;
                ptr1++;
            }
            Msize = Math.max(max-1,Msize);
        }
        return Msize;
    }

    public static void main(String[] args){
        Longest_Subarray_of_ones_s_After_Deleting_One_Element test1 = new Longest_Subarray_of_ones_s_After_Deleting_One_Element();
        int[] nums = {1,1,1,1,0,0,1,1,1,0,1,1,1};
        System.out.println(test1.longestSubarray(nums));
    }
    
}
