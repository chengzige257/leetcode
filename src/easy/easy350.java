package easy;

import org.testng.annotations.Test;

import java.util.Arrays;

public class easy350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length = Math.max(nums1.length,nums2.length);
        int[] nums3 = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                nums3[k++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(nums3,0,k);
    }

    @Test
    public void main() {
        System.out.println(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}
