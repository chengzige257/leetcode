package hard;

import org.testng.annotations.Test;

public class h60 {//

    public String getPermutation(int n, int k) {
        boolean[] flags = new boolean[n];
        int[] array = new int[n];
        array[0] =1;
        for(int i = 1;i<n;i++){
            array[i] = array[i-1]*(i+1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        function(stringBuilder,n-1,k,array,flags);
        return stringBuilder.toString();
    }
    public void function(StringBuilder stringBuilder,int n,int k,int[] array,boolean[] flags){
        if(n==0){
            for(int i = 0;i<flags.length;i++){
                if(!flags[i]){
                    stringBuilder.append(i+1);
                    return;
                }
            }
        }
        int left = k%array[n-1];
        if(left==0){
            left = array[n-1];
        }
        int th = (k-1)/array[n-1]+1;
        int count = 0;
        int i = 0;
        for(;i<flags.length;i++){
            if(!flags[i]){
                count++;
                if(count==th)
                    break;
            }
        }
        stringBuilder.append(i+1);
        flags[i] = true;
        function(stringBuilder,n-1,left,array,flags);
    }
    @Test
    public void main() {
        System.out.println(getPermutation(3, 4));
    }
}
