package Recursoin;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets_II {
    public List<List<Integer>> findCombinations(int[] nums, int index, List<Integer> tempList, List<List<Integer>> arr) {
        arr.add(new ArrayList<>(tempList));
        for(int i=index;i<nums.length;i++) {
            if(i!=index && nums[i] == nums[i-1])
                continue;
            tempList.add(nums[i]);
            System.out.println(tempList);
            findCombinations(nums, i+1, tempList, arr);
            tempList.remove(tempList.size() - 1);
        }
        return arr;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return findCombinations(nums, 0, new ArrayList<>(), new ArrayList<>());
    }
    public static void main(String[] args) {
        Subsets_II test1 = new Subsets_II();
        int[] nums = {4,4,4,1,4};
        System.out.println(test1.subsetsWithDup(nums));

    }
    
}
