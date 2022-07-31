package week;

import org.testng.annotations.Test;

import java.util.Arrays;

public class week1_6133 {
    public int maximumGroups(int[] grades) {
        int length = grades.length;
        int i = 1;
        int count = 0;
        int num = 0;
        while(num<=length){
            num+=i;
            count++;
            i++;
        }
        return --count;
    }
    @Test
    public void main() {
        System.out.println(maximumGroups(new int[]{10, 6, 12, 7, 3, 5}));
        System.out.println(maximumGroups(new int[]{8,8}));
        System.out.println(maximumGroups(new int[]{47,2,16,17,41,4,38,23,47}));
    }
}
