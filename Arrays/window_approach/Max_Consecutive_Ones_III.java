package window_approach;
public class Max_Consecutive_Ones_III {

    public int longestOnes(int[] nums, int k) {
        int Msize = 0;
        int zeroCount = 0;
        int ptr1 = 0;

        for(int ptr2=0;ptr2<nums.length;ptr2++){
            if(nums[ptr2] == 0)
                zeroCount++;

            while(zeroCount > k){
                if(nums[ptr1] == 0)
                    zeroCount--;
                ptr1++;
            }
            Msize = Math.max(Msize,ptr2 - ptr1 + 1);
        }
        return Msize;
    }

    public static void main(String[] args) {
        Max_Consecutive_Ones_III test1 = new Max_Consecutive_Ones_III();

        // int[] nums = {1, 1 , 1 , 0 , 0 , 0 , 1 , 1 , 1 , 1 , 0};
        //             0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30  31  32  33  34
        int[] nums = { 1,1,1,0,0,0,1,1,1,1,0};
        int k = 1;
        System.out.println(test1.longestOnes(nums, k));

    }

}

// 1 1 1 1 1 0 1 1 1 1 0 0 1 1 1 1 1 0 0 0 1 1 1 1
//|same value| 
