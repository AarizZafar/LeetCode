package Random;
import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            int temp = Math.abs(num) - 1;
            if(nums[temp] < 0)
                res.add(temp+1);
            nums[temp] = -nums[temp];
        }
        return res;
    }

    public static void main(String[] args) {
        Find_All_Duplicates_in_an_Array test1 = new Find_All_Duplicates_in_an_Array();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(test1.findDuplicates(nums));

    }
    
}

/*
 * if the index position is found to be negative then the element has repeated twice
 * 
 * 4,3,2,7,8,2,3,1
 * 
 * first appearence of 2 -> make the index position negative 
 * 4, -3, 2 , 7 ...... 2, 3 , 1
 * 
 * second appearence of 2 we see (-3) that it is already negative hence it has appeared 2 times
 */
