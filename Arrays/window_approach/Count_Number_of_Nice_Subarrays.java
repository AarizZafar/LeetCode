package window_approach;
public class Count_Number_of_Nice_Subarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int frameCount = 0;
        int frame = 0;
        int oddCount = 0;
        int ptr1 = 0;

        for(int ptr2=0;ptr2<nums.length;ptr2++){
            if(nums[ptr2]%2 == 1){
                frame = 0;
                oddCount++;
            }

            while(oddCount == k){
                frame++;
                if(nums[ptr1]%2 == 1)
                    oddCount--;
                ptr1++;
            }
            frameCount += frame;
        }
        return frameCount;
    }
    public static void main(String[] args){
        Count_Number_of_Nice_Subarrays test1 = new Count_Number_of_Nice_Subarrays();
        int[] nums = {2,4,6,3,8,10,5,2,4,3,8,10};
        int k = 2;
        System.out.println(test1.numberOfSubarrays(nums, k));
    }
}
