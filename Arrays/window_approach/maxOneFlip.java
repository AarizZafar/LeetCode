package window_approach;
public class maxOneFlip {
    public int oneFlip(int[] nums){
        int Msize = 0;
        int zeroCount = 0;
        int ptr1 = 0;

        for(int ptr2 = 0;ptr2<nums.length;ptr2++){
            if(nums[ptr2] == 0)
                zeroCount++;

            while(zeroCount > 1){
                if(nums[ptr1] == 0)
                    zeroCount--;
                ptr1++;
            }
            Msize = Math.max(Msize,ptr2-ptr1+1);
        }
        return Msize;
    }
    public static void main(String[] args){
        maxOneFlip test1 = new maxOneFlip();
        int[] nums = {1};

        System.out.println(test1.oneFlip(nums));
    }
    
}
