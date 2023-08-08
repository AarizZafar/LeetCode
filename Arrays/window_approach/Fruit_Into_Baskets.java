package window_approach;
import java.util.HashMap;

public class Fruit_Into_Baskets {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
        int size = 0;

        for(int ptr1=0,ptr2=0;ptr2<fruits.length;ptr2++){
            map.put(fruits[ptr2],map.getOrDefault(fruits[ptr2],0) + 1);

            while(map.size() > 2){
                map.put(fruits[ptr1] , map.get(fruits[ptr1]) - 1);
                if(map.get(fruits[ptr1]) == 0)
                    map.remove(fruits[ptr1]);
                ptr1++;
            }
            size = Math.max(ptr2-ptr1+1,size);
        }
        return size;
    }
    public static void main(String[] args) {
        Fruit_Into_Baskets test1 = new Fruit_Into_Baskets();
        int[] fruits = {3,3,3,1,2,1,1,2,3,2,2,2,2,2,3,4};
        System.out.println(test1.totalFruit(fruits)); 

    }
    
}
