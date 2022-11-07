package easy;

import org.testng.annotations.Test;

public class easy205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] chars1 = new char[128];
        char[] chars2 = new char[128];
        for(int i=0;i<s.length();i++){
            if(chars1[s.charAt(i)]==0){
                chars1[s.charAt(i)]=t.charAt(i);
            }
            if(chars2[t.charAt(i)]==0){
                chars2[t.charAt(i)]=s.charAt(i);
            }
            if(chars1[s.charAt(i)]!=t.charAt(i)||chars2[t.charAt(i)]!=s.charAt(i))
                return false;
        }
        return true;
    }
//    public boolean isIsomorphic(String s, String t) {
//        Map<Object,Integer> map= new HashMap();
//        Integer i = 0;
//        for (; i < s.length(); i++) {
//            if(map.put(s.charAt(i),i) != map.put(t.charAt(i)+"",i)) return false;//put方法返回的是旧的value
//        }
//        return true;
//    }
    @Test
    public void main() {
        System.out.println(isIsomorphic("baba", "badc"));
    }
}
