import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class easy703 {//数据流中的第K大元素


    class KthLargest{//时间8%自己做的
        int  k;
        int[] nums;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            sort(nums);
            if(k<=nums.length)
                this.nums = Arrays.copyOfRange(nums, 0, k);
            else{
                this.nums = Arrays.copyOfRange(nums, 0, k);
                for(int i = k-1;i>=nums.length;i--)
                    this.nums[i] = Integer.MIN_VALUE;
            }
            sort();
        }

        public int add(int val) {

            if(val<=nums[0]){
                return nums[0];
            }else{
                nums[0] = val;
                sort();
            }
            return nums[0];
        }

        void sort(int[] nums){
            for(int i = 0;i<k;i++){
                int index = i;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]>nums[index]){
                        index = j;
                    }
                }
                if(index!=i){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
            }
        }

        void sort(){
            for(int q = (k-2)/2;q >= 0;q--){
                heapify(q,k-1);
            }
        }

        void heapify(int i,int hight){
            int j = 2*i+1;
            while(j<=hight){
                if(j<hight&&nums[j+1]<nums[j]){
                    j=j+1;
                }
                if(nums[i]>=nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                i = j;
                j = 2*i+1;
            }
        }

    }
//    class KthLargest {//官方98%
//        PriorityQueue<Integer> pq;
//        int k;
//
//        public KthLargest(int k, int[] nums) {
//            this.k = k;
//            pq = new PriorityQueue<Integer>();
//            for (int x : nums) {
//                add(x);
//            }
//        }
//
//        public int add(int val) {
//            pq.offer(val);
//            if (pq.size() > k) {
//                pq.poll();
//            }
//            return pq.peek();
//        }
//    }
    @Test
    public void main() {
        int[] ints = new int[0];
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        KthLargest kthLargest = new KthLargest(1,new int[0]);

        System.out.println(kthLargest.add(-3));
        System.out.println(kthLargest.add(-2));
        System.out.println(kthLargest.add(-4));
        System.out.println(kthLargest.add(0));
        System.out.println(kthLargest.add(4));
    }

}
