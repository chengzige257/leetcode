import org.testng.annotations.Test;

public class easy14 {//最长公共前缀
    public String longestCommonPrefix(String[] strs) {//我的方法
        int length = strs.length;
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLength)
                minLength = strs[i].length();
        }
        while(count<=minLength-1){//加上count>=0击败69%的用户，而去掉直接击败100%，unbelievable
            boolean flag = true;
            char c = ' ';
            for(int i=0;i<length;i++){
                if(c==' ')
                    c=strs[i].charAt(count);
                if(c!=strs[i].charAt(count)){
                    flag = false;
                    break;
                }
            }

            if(!flag)
                break;
            count++;
        }
        return strs[0].substring(0,count);
    }
    //方法二
//    public boolean isSameAtIndex(String[] strs, int index) {
//        int i = 0;
//        while (i < strs.length - 1) {
//            if (strs[i].charAt(index) == strs[i + 1].charAt(index)) {
//                i++;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0)
//            return "";
//        //得到最短的字符串的⻓度
//        int minLength = Integer.MAX_VALUE;
//        for (String str : strs) {
//            if (str.length() < minLength) {
//                minLength = str.length();
//            }
//        }
//        int j = 0;
//        //遍历所有列
//        for (; j < minLength; j++) {
//            //如果当前列字符不完全相同，则结束循环
//            if (!isSameAtIndex(strs, j)) {
//                break;
//            }
//        }
//        return strs[0].substring(0, j);
//    }
    @Test
    public void main() {
        System.out.println(longestCommonPrefix(new String[]{"flight","flow","flower"}));
    }
}
