package theSwordSefersToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class offer41 {
    class MedianFinder {
        boolean flag;//偶数为true
        List<Integer> list;
        /** initialize your data structure here. */
        public MedianFinder() {
            flag = true;
            list = new ArrayList<>();
        }

        public void addNum(int num) {
            list.add(num);
            Collections.sort(list);
        }

        public double findMedian() {
            if(list.size()%2==0){
                return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
            }else{
                return list.get(list.size() / 2);
            }
        }
    }
}
