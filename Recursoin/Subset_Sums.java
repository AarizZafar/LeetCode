package Recursoin;
import java.util.ArrayList;
import java.util.*;

public class Subset_Sums {
    public ArrayList<Integer> findAllSums(ArrayList<Integer> arr, int index, int sum, ArrayList<Integer> tempList) {
        if(index == arr.size()) {
            tempList.add(sum);
            return tempList;
        }

        sum += arr.get(index);
        findAllSums(arr, index + 1, sum, tempList);

        sum -= arr.get(index);
        findAllSums(arr, index + 1, sum, tempList);

        return tempList;
    }

    public ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> tempList = new ArrayList<>();
        findAllSums(arr, 0, 0, tempList);
        Collections.sort(tempList);  
        return tempList;
    }
    public static void main(String[] args) {
        Subset_Sums test1 = new Subset_Sums();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(test1.subsetSums(arr, 2));
    }
}
