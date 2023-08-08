package Dynamic_programing;
public class Climbing_Stairs {
    public int climbStairs(int n) {
        int[] stairStepsCombi = new int[n];
        stairStepsCombi[0] = 1;
        stairStepsCombi[1] = 2;
// To calculate the next step the first step is automatically added 
// Use the example of 1 and 2 step only to understand
        for(int i=2;i < stairStepsCombi.length;i++)
            stairStepsCombi[i] = stairStepsCombi[i-1] + stairStepsCombi[i-2]; 

        return stairStepsCombi[stairStepsCombi.length - 1];
    }

    public static void main(String[] args) {
        Climbing_Stairs test1 = new Climbing_Stairs();
        System.out.println(test1.climbStairs(3));
    }
}
