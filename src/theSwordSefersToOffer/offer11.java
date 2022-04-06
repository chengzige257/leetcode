package theSwordSefersToOffer;

public class offer11 {//旋转数组的最小数字
    public int minArray(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }

        }
        return min;
    }
}
