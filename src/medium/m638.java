package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//输入：price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
//输出：14
//解释：有 A 和 B 两种物品，价格分别为 ¥2 和 ¥5 。
//大礼包 1 ，你可以以 ¥5 的价格购买 3A 和 0B 。
//大礼包 2 ，你可以以 ¥10 的价格购买 1A 和 2B 。
//需要购买 3 个 A 和 2 个 B ， 所以付 ¥10 购买 1A 和 2B（大礼包 2），以及 ¥4 购买 2A 。
public class m638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        List<List<Integer>> filterSpecial = new ArrayList<>();
        for (List<Integer> list : special) {
            int sum = 0;
            for (int i = 0;i<price.size();i++) {
                sum+=price.get(i)*list.get(i);
            }
            if(sum>list.get(price.size())){
                filterSpecial.add(list);
            }
        }
        return dfs(price, filterSpecial, needs);
    }
    public int dfs(List<Integer> price,List<List<Integer>> filterSpecial,List<Integer> needs){

        int min = 0;
        for(int i = 0;i<price.size();i++){
            min+=price.get(i)*needs.get(i);
        }
        for (List<Integer> list : filterSpecial) {
            List<Integer> nextNeeds = new ArrayList<>();
            for(int i = 0;i<needs.size();i++){
                if(list.get(i)>needs.get(i)){
                    break;
                }
                nextNeeds.add(needs.get(i)-list.get(i));
            }
            if(nextNeeds.size()==price.size()){
                min = Math.min(min,list.get(price.size())+dfs(price,filterSpecial,nextNeeds));
            }
        }
        return min;
    }
    @Test
    public void main() {
        List<Integer> price = new ArrayList<>();
        price.add(2);
        price.add(5);
        List<Integer> needs = new ArrayList<>();
        needs.add(3);
        needs.add(2);
        List<List<Integer>> special = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(0);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(10);
        special.add(list1);
        special.add(list2);
        System.out.println(shoppingOffers(price, special, needs));
    }
}
