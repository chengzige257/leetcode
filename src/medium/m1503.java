package medium;

import org.testng.annotations.Test;

import java.util.Arrays;

public class m1503 {
    public int getLastMoment(int n, int[] left, int[] right) {

        if(left.length==0)
            return n-right[0];
        if(right.length==0)
            return left[left.length-1];
        Arrays.sort(left);
        Arrays.sort(right);
        return Math.max(left[left.length-1],n-right[0]);
    }
    @Test
    public void main() {

    }
}
