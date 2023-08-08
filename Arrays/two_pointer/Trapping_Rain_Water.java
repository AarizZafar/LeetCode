package two_pointer;
public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int trapWater = 0;
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int Rmax = 0;
        int Lmax = 0;

        while(ptr1 <= ptr2){
            if(height[ptr1] >= height[ptr2]) {
                if(height[ptr2] > Rmax)
                    Rmax = height[ptr2];
                else 
                    trapWater += Rmax - height[ptr2];
                ptr2--;
            } // Rmax will keep moving left and keep subtraction all the values less than it 
            else {
                if(height[ptr1] > Lmax)
                    Lmax = height[ptr1];
                else
                    trapWater += Lmax - height[ptr1];
                ptr1++;
            } // Lmax will keep moving right and keep subtracting all the values less than it
        }
        return trapWater;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water test1 = new Trapping_Rain_Water();
        int[] height = { 4,2,0,3,2,5};
        System.out.println(test1.trap(height));
    }

}
