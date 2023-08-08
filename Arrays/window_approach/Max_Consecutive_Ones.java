package window_approach;
public class Max_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int Msize = 0;
        int max = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                max++;
                Msize = Math.max(Msize,max);
            }
            else if(nums[i] == 0)
                max = 0;
        }
        return Msize;
    }

    public static void main(String[] args){
        Max_Consecutive_Ones test1 = new Max_Consecutive_Ones();
        int[] nums = {0,0,0};

        System.out.println(test1.findMaxConsecutiveOnes(nums));

    }
    
}


/* 0 1 2 3 4 5 6  -> (6-0+1) = 7 
 * 1 1 1 1 1 1 1 
 * 
 * 0  -> (0-0+1) incorrect
 * 1
 */
