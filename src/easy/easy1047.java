import org.testng.annotations.Test;

public class easy1047 {//删除字符串中的所有相邻重复项
    public String removeDuplicates(String s) {
        if("".equals(s))
            return "";
        int length = s.length();
        char[] chars = new char[length];
        int top = -1;
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(top==-1){
                chars[++top] = c;
                continue;
            }
            if(chars[top]!=c)
                chars[++top]=c;
            else{
                top--;
            }
        }
        return new String(chars,0,top+1);
    }



    @Test
    public void main() {
        System.out.println(removeDuplicates("c"));
    }
}
