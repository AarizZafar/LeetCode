package two_pointer;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        m = m - 1;
        n = n - 1;
        
        while (n >= 0 && m >=0) {
            if (nums1[m] > nums2[n]) 
                nums1[k--] = nums1[m--];
            else 
                nums1[k--] = nums2[n--];
        }

        // if the nums1 array has been sorted then nums2 array is still left 
        while(n>0)
            nums1[k--] = nums2[n--];

        System.err.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        Merge_Sorted_Array test1 = new Merge_Sorted_Array();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6}; 
        int m = 3;
        int n = 3;
        test1.merge(nums1,m,nums2, n);
    }
}

/* MORE EFFICIENT SOLUTION
public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        m = m - 1;
        n = n - 1;
        
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) 
                nums1[k--] = nums1[m--];
            else 
                nums1[k--] = nums2[n--];
        }
        System.err.println(Arrays.toString(nums1));
    }
 * 
 */
