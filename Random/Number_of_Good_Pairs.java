package Random;
public class Number_of_Good_Pairs{
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Number_of_Good_Pairs test1 = new Number_of_Good_Pairs();
        int[] nums = {1,1,1,1};
        System.out.println(test1.numIdenticalPairs(nums));
    }
}