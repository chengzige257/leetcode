package medium;

import org.testng.annotations.Test;

public class m11 {//盛最多水的容器，
    public int maxArea(int[] height) {
        int length = height.length;
        int max = 0;
        int i = 0;
        int j = length-1;
        while(i!=j){
            max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]){//双指针，宽度一定会变小，那么高度就应该保留更高的那一边
                i++;
            }else{
                j--;
            }
        }
        return max;
     }
    @Test
    public void main() {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
