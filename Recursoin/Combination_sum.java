package Recursoin;
import java.util.ArrayList;
import java.util.List;

// if we have an array with unique numbers and we want to find the target value 
// and an element in the array is allowed to be repeated multiple times

public class Combination_sum {
    public List<List<Integer>> findCombinations(int[] candidates, int index, int target, List<Integer> tempList 
                                                ,List<List<Integer>> combinations) {
        if(index == candidates.length) {
            if(target == 0) 
                combinations.add(new ArrayList<>(tempList));
                /*
                 * tempList is a non primitive data type when we pass is to the function the changes takes place on the tempList
                 * directy because of the referal type and hence we will see only one tempList in the combination 
                 * 
                 * to add the new changes to the combination we create a new tempList new address and add it to the combination array
                 * hence we see new tempList getting added.
                 */
            return combinations;
        }
        if(candidates[index] <= target) {
            tempList.add(candidates[index]);
            findCombinations(candidates, index, target - candidates[index], tempList, combinations);
            /*  
                This below code is done beacause if we have reached the end of the candidates array and the target is not == 0
                then we remover the element from the tempList and send it to the right side.
            */
            tempList.remove(tempList.size() - 1);
        }
        /*  The reason why we cannot put this code below here is because we are removing the element from the array 
            and sending it to the right side of the tree when the target is smaller than the array index val which is wrong. 
            we are not suppose to remove the element if the array index value is larger than the target value because nothing
            has been addes to the array
        */ 
        // tempList.remove(tempList.size() - 1);
        findCombinations(candidates, index + 1, target, tempList, combinations);
        return combinations;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(candidates, 0, target, new ArrayList<>() , combinations);

        return combinations;
    }

    public static void main(String[] args) {
        // The reason that every combination will be unique is that every index has the YES/NO option of beeing picked
        // and even of beeing picked multiple times. 
        Combination_sum test1 = new Combination_sum();
        int[] candidates = {2,3,4,5,6,7};
        System.out.println(test1.combinationSum(candidates, 2));
        
    }
}
