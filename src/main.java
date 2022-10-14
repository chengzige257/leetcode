public class main {

    public static void main(String[] args) {
        System.out.println(function2(new int[]{0,1,2,4,5,6}));
    }

    public static int function2(int[] nums){
        int length = nums.length;
        int left = 0;
        int right = length-1;
        int med = (left+right)/2;
        while(left!=right){
            if(med!=nums[med]){
                return med;
            }else{

            }
            med = (left+right)/2;
        }
        return nums[med];
    }
    public void fun1(String[] a){

    }
    public void fun1(Integer[] a){

    }

}
