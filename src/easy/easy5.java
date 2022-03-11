package easy;

import org.testng.annotations.Test;

public class easy5 {
//    public String longestPalindrome(String s) {//最长回文子串方法一
//        if("".equals(s))
//            return "";
//        int length = s.length();
//        String reverse = new StringBuffer(s).reverse().toString();
//        int[][] index = new int[length][length];
//        int maxLen = 0;
//        int maxEnd = 0;
//        for(int i = 0;i<length;i++){
//            for(int j = 0;j<length;j++){
//                if(reverse.charAt(j)==s.charAt(i)){
//                    if(i==0||j==0)
//                        index[i][j]=1;
//                    else
//                        index[i][j]=index[i-1][j-1]+1;
//                }
//                if(index[i][j]>maxLen){
//                    int start = length-1-j;
//                    if(start+index[i][j]-1==i){
//                        maxLen = index[i][j];
//                        maxEnd = j;
//                    }
//                }
//
//            }
//        }
//        return s.substring(maxEnd-maxLen+1,maxEnd+1);
//    }
    //动态规划优化空间复杂度
//    public String longestPalindrome(String s){
//        if("".equals(s))
//            return "";
//        String ss = s;
//        String reverse = new StringBuffer(ss).reverse().toString();
//        int length = s.length();
//        int[] arr = new int[length];
//        int maxLen=0;
//        int maxEnd=0;
//        for(int i = 0;i<length;i++)
//            for(int j=length-1;j>=0;j--){
//                if(s.charAt(i)==reverse.charAt(j)){
//                    if(i==0||j==0)
//                        arr[j]=1;
//                    else
//                        arr[j]=arr[j-1]+1;
//                }else
//                    arr[j]=0;
//                if(arr[j]>maxLen){
//                    int start = length-1-j;
//                    if(start+arr[j]-1==i){
//                        maxLen = arr[j];
//                        maxEnd = i;
//                    }
//                }
//            }
//        return s.substring(maxEnd-maxLen+1,maxEnd+1);
//    }
    //方法三: 扩展中心
//    public String longestPalindrome(String s){
//        int start = 0;
//        int end = 0;
//        int length = s.length();
//        int maxLen = 0;
//        for(int i=0;i<length;i++){
//            int len1 = expandCenter(s,i,i);
//            int len2 = expandCenter(s,i,i+1);
//            if(Math.max(len1,len2)>maxLen){
//                maxLen = Math.max(len1,len2);
//                if(len1>len2){
//                    start = i-len1/2;
//                    end = i+len1/2;
//                }else{
//                    start = i-len2/2+1;
//                    end = i+1+len2/2-1;
//                }
//            }
//        }
//        return s.substring(start,end+1);
//    }
//
//    public int expandCenter(String s,int left,int right){
//        if(right>=s.length())
//            return 0;
//        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
//            left--;
//            right++;
//        }
//        return right-left-1;
//    }
    //方法四：马拉车算法
    public String longestPalindrome(String s){
        String ss = preprocess(s);
        int length = ss.length();
        int[] p =new int[length];
        int C = 0;
        int R = 0;
        int mirror;
        int index=0;
        int maxLen = 0;
        for(int i=1;i<length-1;i++){
            mirror = 2*C-i;
            if(R>i){
                p[i]=Math.min(R-i,p[mirror]);
            }else{
                p[i]=0;
            }

            while(ss.charAt(i-p[i]-1)==ss.charAt(i+p[i]+1)){
                p[i]++;
            }
            if(p[i]>maxLen){
                maxLen = p[i];
                index = i;
            }
            if(i+p[i]>R){
                C=i;
                R=i+p[i];
            }
        }
        return s.substring((index-p[index])/2,(index-p[index])/2+p[index]);
    }
    public String preprocess(String s){
        if(s==null||"".equals(s)){
            return "^$";
        }
        StringBuilder ret = new StringBuilder("^");
        for(int i=0;i<s.length();i++){
            ret.append("#").append(s.charAt(i));
        }
        return ret.append("#$").toString();
    }
    @Test
    public void main() {
        System.out.println(longestPalindrome("babad"));
    }
}
