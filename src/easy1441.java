import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class easy1441 {//用栈操作构建数组
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

    @Test
    public void main() {
        List<String> strings = buildArray(new int[]{1, 2, 4}, 4);
        for (String string : strings) {

            System.out.println(string);
        }
    }

}
