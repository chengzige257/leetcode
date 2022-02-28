import org.testng.annotations.Test;

public class easy125 {//验证回文串
    public boolean isPalindrome(String s) {
        if("".equals(s))
            return true;
        int i=0,j=s.length()-1;
        int ic,jc;
        char p = 0,q = 0;
        p=s.charAt(i);
        q=s.charAt(j);
        while(true){
            while(!(p>='a'&&p<='z'||p>='A'&&p<='Z'||p>='0'&&p<='9')){
                i++;
                if(i<s.length())
                    p=s.charAt(i);
                else
                    break;
            }
            while(!(q>='a'&&q<='z'||q>='A'&&q<='Z'||q>='0'&&q<='9')){
                j--;
                if(j>=0)
                    q=s.charAt(j);
                else
                    break;
            }
            if(i>j)
                break;
            if(q>='A'&&q<='Z')
                jc = q+'z'-'Z';
            else
                jc = q;
            if(p>='A'&&p<='Z')
                ic = p+'z'-'Z';
            else
                ic = p;
            if(ic!=jc)
                return false;
            i++;
            j--;
            if(i<s.length())
                p=s.charAt(i);
            else
                break;
            if(j>=0)
                q=s.charAt(j);
            else
                break;
        }
        return true;
    }
    @Test
    public void main() {
        System.out.println(isPalindrome("race e car"));
//        System.out.println((int)'a');
//        System.out.println('A'+'z'-'Z');
    }

}
