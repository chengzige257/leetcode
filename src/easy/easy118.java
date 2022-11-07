package easy;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class easy118 {
    //执行耗时:3 ms,击败了7.75% 的Java用户
    //内存消耗:39.4 MB,击败了5.03% 的Java用户
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> lists = new ArrayList<>();
//        int[] list = new int[numRows];
//        list[0] = 1;
//        lists.add(Arrays.stream(list).limit(1).boxed().collect(Collectors.toList()));
//        for(int i=2;i<=numRows;i++){
//            for(int j=i-1;j>=1;j--){
//                list[j] = list[j-1] + list [j];
//            }
//            lists.add(Arrays.stream(list).limit(i).boxed().collect(Collectors.toList()));
//        }
//        return lists;
//    }
    //
//    执行耗时:0 ms,击败了100.00% 的Java用户
//    内存消耗:39.1 MB,击败了21.46% 的Java用户
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        //第一行
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);//此时才把第一行的数据存储到list中

        for (int i = 1; i < numRows; i++) {
            List<Integer> list0 = new ArrayList<>();
            list0.add(1);//每一行的开始都是1

            List<Integer> preRow = list.get(i-1);//拿到上一行的数字
            for (int j = 1; j < i; j++) {
                //中间情况
                int num = preRow.get(j) + preRow.get(j-1);
                list0.add(num);
            }

            list0.add(1);//每一行的结束都是1
            list.add(list0);
        }
        return list;
    }
    @Test
    public void main() {
        List<List<Integer>> generate = generate(5);
        for (List<Integer> list : generate) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }
}
