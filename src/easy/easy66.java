package easy;

import org.testng.annotations.Test;

public class easy66 {//加一


    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;
        for(int i = digits.length-1;i>=0;i--){
            sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;

            if(i==0&&carry==1){
                digits = new int[digits.length+1];
                digits[0] = 1;
                return digits;
            }
            if(carry==0)
                return digits;
        }
        return digits;
    }

    @Test
    public void main() {
        int[] a =new int[]{8,9,9};
        int[] ints = plusOne(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
