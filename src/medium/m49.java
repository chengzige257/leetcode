package medium;

import org.testng.annotations.Test;

import java.util.*;

public class m49 {//字母异位词分组
    @Test
    public void main() {

    }


    public List<List<String>> groupAnagrams(String[] strs) {//解法1
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        //解法2，Java不能通过（溢出），将字母映射到质数，然后相乘，这样字母异位词会得到同一个值
//
//        List<List<String>> res = new ArrayList<>();
//        // 字母与质数对应数组
//        int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
//
//        HashMap<Integer, List<String>> map = new HashMap<>();
//        int len = strs.length;
//        for (int i = 0; i < len; i++) {
//            int sum = 1;
//            int len2 = strs[i].length();
//            // 计算乘积
//            for (int j = 0; j < len2; j++) {
//                sum *= arr[(strs[i].charAt(j) - 'a')];
//            }
//            if(map.get(sum) != null) {
//                map.get(sum).add(strs[i]);
//            }else {
//                ArrayList<String> strList = new ArrayList<>();
//                strList.add(strs[i]);
//                map.put(sum, strList);
//            }
//        }
//
//        for(Map.Entry<Integer, List<String>> s : map.entrySet()) {
//            res.add(s.getValue());
//        }
//
//        return res;
//    }
}
