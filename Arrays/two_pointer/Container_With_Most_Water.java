package two_pointer;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        System.out.println(ptr2);
        while(ptr1 <= ptr2) {
            int h = Math.min(height[ptr1],height[ptr2]);
            maxArea = Math.max(maxArea,h*(ptr2-ptr1));
            // System.out.println("ptr2 - ptr1 : " + (ptr2 - ptr1) + " , h : " + h + " , maxArea : " + maxArea);
            if(height[ptr1] >= height[ptr2])
                ptr2--;
            else
                ptr1++;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Container_With_Most_Water test1 = new Container_With_Most_Water();
        int[] height = {1,1};
        System.out.println(test1.maxArea(height));
    }
}   
