package easy;

import org.testng.annotations.Test;

public class easy88 {//合并两个有序数组
//    public void merge(int[] nums1, int m, int[] nums2, int n) {//我的垃圾方法，耗时多，思想还复杂17%
//        if(n==0)
//            return;
//        Queue<Integer> queue = new LinkedList<>();
//        int top = 0;
//        for(int i = 0;i<m;i++){////-1,0,0,1,1,1,2,3,3
//            if(top==n){
//                if(!queue.isEmpty()&&queue.element()<nums1[i]){
//                    queue.add(nums1[i]);
//                    nums1[i] = queue.poll();
//                }
//                continue;
//            }
//            if(!queue.isEmpty() && queue.element() <= nums2[top]){
//                queue.add(nums1[i]);
//                nums1[i] = queue.poll();
//            }
//            if(nums1[i]>nums2[top]){
//                queue.add(nums1[i]);
//                nums1[i]=nums2[top++];
//            }
//        }
//        for(int i = m;i<m+n;i++){
//            if(!queue.isEmpty()){
//                if(top!=n&&queue.element()>nums2[top]){
//                    nums1[i]=nums2[top++];
//                }else{
//                    nums1[i] = queue.poll();;
//                }
//            }else{
//                nums1[i] = nums2[top++];
//            }
//        }
//
//    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {//逆向双指针100%
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        int cur;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }


    @Test
    public void main() {
//        Arrays.copy
        //arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
//        System.arraycopy(nums2,0,nums1,m,n);从nums2的下标0开始拷贝n个到nums1从m下标开始的位置

//        int[] a  = new int[]{1,2,3,0,0,0};
//        int[] b  = new int[]{2,5,6};
//        merge(a,3,b,3);
//        for (int i : a) {
//            System.out.println(i);
//        }
//        int[] a  = new int[]{4,0,0,0,0,0};
//        int[] b  = new int[]{1,2,3,5,6};
//        merge(a,1,b,5);
//        for (int i : a) {
//            System.out.println(i);//1,2
//        }
        int[] a  = new int[]{2,0};
        int[] b  = new int[]{1};
        merge(a,1,b,1);
        for (int i : a) {
            System.out.println(i);//1,2
        }
//        int[] a  = new int[]{1,2,4,5,6,0};
//        int[] b  = new int[]{3};
//        merge(a,5,b,1);
//        for (int i : a) {
//            System.out.println(i);//1,2
//        }
//        int[] a  = new int[]{0,0,3,0,0,0,0,0,0};
//        int[] b  = new int[]{-1,1,1,1,2,3};
//        merge(a,3,b,6);
//        for (int i : a) {
//            System.out.println(i);//-1,0,0,1,1,1,2,3,3
//        }
    }
}
