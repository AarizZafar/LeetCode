package Random;
import java.util.Arrays;

public class first_and_last_occurance {
    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];

        index[0] = leftFind(nums,target);
        index[1] = rightFind(nums, target);

        return index;
    }

    public int leftFind(int[] nums,int target) {
        int lidx = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
                end = mid - 1;
            else if(target > nums[mid])
                start = mid + 1;
            else{
                lidx = mid;
                end = mid - 1;
            }
        }
        return lidx;
    }

    public int rightFind(int[] nums, int target) {
        int ridx = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
                end = mid - 1;
            else if(target > nums[mid])
                start = mid + 1;
            else{
                ridx = mid;
                start = mid + 1;
            }
        }
        return ridx;
    }

    public static void main(String[] args) {
        first_and_last_occurance test1 = new first_and_last_occurance();
        int[] nums = {1,2,3,5,5,6,6,6,7,8};
        System.out.println(Arrays.toString(test1.searchRange(nums,6)));

        
    }
    
}

