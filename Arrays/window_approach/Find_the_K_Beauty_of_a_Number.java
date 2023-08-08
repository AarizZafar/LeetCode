package window_approach;
public class Find_the_K_Beauty_of_a_Number {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int ptr1 = 0;
        String temp = String.valueOf(num);

        for(int ptr2=k;ptr2<=temp.length();ptr2++){
            int n = Integer.parseInt(temp.substring(ptr1,ptr2));
            if(n>0){
                if(num%n == 0)
                    count++;
            }
            ptr1++;
        }
        return count;
    }

    public static void main(String[] args){
        Find_the_K_Beauty_of_a_Number test1 = new Find_the_K_Beauty_of_a_Number();
        int num = 430043;
        int k = 2;

        System.out.println(test1.divisorSubstrings(num, k));

    }
    
}
