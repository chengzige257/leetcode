import org.testng.annotations.Test;

public class easy4 {//寻找两个正序数组的中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (getKth(nums1,0,m-1,nums2,0,n-1,left)+getKth(nums1,0,m-1,nums2,0,n-1,right))*0.5;
    }

    public double getKth(int[] nums1,int begin1,int end1,int[] nums2,int begin2,int end2,int k){
        int len1 = end1 - begin1+1;
        int len2 = end2 - begin2+1;
        if(len1>len2)
            return getKth(nums2,begin2,end2,nums1,begin1,end1,k);
        if(len1==0)
            return nums2[begin2-1+k];
        if(k==1)
            return Math.min(nums1[begin1], nums2[begin2]);

        int i = Math.min(end1,begin1-1+k/2);
        int j = Math.min(end2,begin2-1+k/2);
        if(nums1[i]>nums2[j])
            return getKth(nums1,begin1,end1,nums2,j+1,end2,k-j+begin2-1);
        else
            return getKth(nums1,i+1,end1,nums2,begin2,end2,k-i+begin1-1);

    }
    @Test
    public void main(){

    }
}
