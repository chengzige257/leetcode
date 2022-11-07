package easy;

public class easy561 {//数组拆分
//    public int arrayPairSum(int[] nums) {
//        int sum = 0;
//        int count = 0;
//        for(int i = 0;i<nums.length;++i){
//            int max = i;
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]>nums[max]){
//                    max=j;
//                }
//            }
//            if(max!=i){
//                int t = nums[max];
//                nums[max] = nums[i];
//                nums[i]=t;
//            }
//            count++;
//            if(count%2==0)
//                sum+=nums[i];
//        }
//        return sum;
//    }


//    public int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int ans = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            ans += nums[i];
//        }
//        return ans;
//    }

    public int arrayPairSum(int[] nums) {//计数排序
        int[] counts = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]+10000]++;//＋10000是为了解决下标问题，因为nums[i]的范围是-10000--10000
        }
        int result = 0;
        int before = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                continue;
            }
            if (counts[i]%2 == 0) {
                result += ((counts[i]/2) * (i - 10000));
            } else {
                if (before%2 ==0) {
                    result += ((counts[i]/2 + 1) * (i - 10000));
                } else {
                    result += ((counts[i]/2) * (i - 10000));
                }
            }
            before += counts[i];
        }
        return result;
    }


}
