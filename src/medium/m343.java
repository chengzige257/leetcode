package medium;

import org.testng.annotations.Test;

public class m343 {


//    public int integerBreak(int n) {
//        int[][] arr= new int[n+1][n+1];
//        for(int i =2;i<=n;i++){
//            arr[i][i] = 1;
//            int half = i/2;
//            arr[i][2] = i%2==0?half*half:half*(half+1);
//        }
//        int MAX = arr[n][2];
//        for(int i = 4;i<=n;i++){
//            for(int j = 3;j<i;j++){//j表示分成几个数字
//                int count = i-j+1;
//                int max = 1;
//                for(int k = 1;k<=count;k++){
//                    int sum = k*arr[i-k][j-1];
//                    if(sum>max){
//                        max = sum;
//                    }
//                }
//                arr[i][j] =max;
//            }
//        }
//        for(int i = 3;i<n;i++){
//            if(arr[n][i]>MAX){
//                MAX=arr[n][i];
//            }
//        }
//        return MAX;
//    }

    public int integerBreak(int n){//方法二
        int[] arr = new int[n+1];
        arr[0]=arr[1]=1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<i;j++){
                arr[i] = Math.max(arr[i],Math.max(j*(i-j),j*arr[i-j]));
            }
        }
        return arr[n];
    }

    @Test
    public void main() {
        System.out.println(integerBreak(6));
    }
}
