import org.testng.annotations.Test;

public class easy387 {//字符串中的第一个唯一字符

    public int firstUniqChar(String s) {
        int[][] count = new int[26][2];
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a'][0]++==0)
                count[s.charAt(i)-'a'][1]=i;

        }
        int index = Integer.MAX_VALUE;
        for(int i = 0;i<=25;i++){
            if(count[i][0]==1&&count[i][1]<index){
                index = count[i][1];
            }
        }
        return index==Integer.MAX_VALUE?-1:index;
    }

    @Test
    public void main() {
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
