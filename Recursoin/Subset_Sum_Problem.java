package Recursoin;
import java.util.List;
import java.util.ArrayList;

public class Subset_Sum_Problem {
    public boolean findSubSet(int index, int target, int[] arr, List<Integer> tempArray) {
        if(index == arr.length) {
            if(target == 0) {
                System.out.println(tempArray);
                return true;
            }
            return false;
        }

        tempArray.add(arr[index]);
        if(findSubSet(index+1, target - arr[index], arr, tempArray))
            return true;

        tempArray.remove(tempArray.size() - 1);
        if(findSubSet(index + 1, target, arr, tempArray))
            return true;

        return false;
    }

    public Boolean isSubsetSum(int N, int arr[], int sum) {
        return findSubSet(0,sum,arr,new ArrayList<Integer>());
    }

    public static void main(String[] args) {
        Subset_Sum_Problem test1 = new Subset_Sum_Problem();
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println(test1.isSubsetSum(arr.length, arr, 9));
    }
    
}
