package medium;

import org.testng.annotations.Test;

public class m34 {//在排序数组中查找元素的第一个和最后一个位置
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        int i = 0;
        int j = length-1;

        while(i<=j){
            int m = (i+j)/2;
            if(nums[m]<target){
                i = m+1;
            }else if(nums[m]>target){
                j = m-1;
            }else{
                int start = m;
                int end = m;
                boolean startFlag=false;
                boolean endFlag = false;
                while(!startFlag||!endFlag){
                    if(start-1>=0&&nums[start-1]==target)
                        start--;
                    else
                        startFlag = true;
                    if(end+1<length&&nums[end+1]==target)
                        end++;
                    else
                        endFlag = true;
                }
                return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }
    @Test
    public void main() {
        int[] ints = searchRange(new int[]{0, 0, 0, 1, 2, 3}, 0);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
