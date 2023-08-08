package Recursoin;

import java.util.List;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Arrays;

// if we have repeated values in our array and we want to find the unique combinations
public class Combination_Sum_II {
    public void findCombinations(int index, int target, int[] candidates, ArrayList<Integer> tempList,
                                List<List<Integer>> combination) { 
        /*  we do not need to put a if condition for index, because when index == candidates.length 
            the function will return by itself
        */
        if(target == 0) {
            combination.add(new ArrayList<>(tempList));
            return;
        }

        for(int i=index;i < candidates.length;i++) {
            if(i > index && candidates[i] == candidates[i-1])
                continue;
                /* we are sending an sorted array of candidates because if the first element in the candidates array 
                 * is larger than the target it self then the loop will break in the first iteration  itself and an empth 
                 * tempList will be returned
                 */
            if(candidates[i] > target)
                break;

            tempList.add(candidates[i]);
            findCombinations(i+1, target-candidates[i], candidates, tempList, combination);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, target, candidates, new ArrayList<Integer>(), combinations);

        return combinations;
    }

    public static void main(String[] args) {
        Combination_Sum_II test1 = new Combination_Sum_II();
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        List<List<Integer>> temp = test1.combinationSum2(candidates, 8);
        for (List<Integer> i : temp)
            System.out.println(i);
    }
}
