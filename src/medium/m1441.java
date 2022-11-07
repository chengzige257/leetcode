package medium;

import java.util.ArrayList;
import java.util.List;

public class m1441 {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> strings = new ArrayList<>();
        int q = 0;
        for (int i =1;i<=n;i++) {
            if(q>=target.length)
                break;
            strings.add("Push");
            if(target[q]==i){
                q++;
            }else{
                strings.add("Pop");
            }
        }
        return strings;
    }
}
