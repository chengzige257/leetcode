package week;

import org.testng.annotations.Test;

public class week1_6134 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int length = edges.length;
        int[] array1 = new int[length];//node1节点到某个节点的距离+1，为0表示不能到达
        int[] array2 = new int[length];
        int current = node1;
        int i = 1;
        while(edges[current]!=-1&&array1[current]==0){
            array1[current] = i;
            current = edges[current];
            i++;
        }
        if(array1[current]==0)
            array1[current] = i;


        i=1;
        current = node2;

        while(edges[current]!=-1&&array2[current]==0){
            array2[current] = i;
            current = edges[current];
            i++;
        }
        if(array2[current]==0)
            array2[current] = i;


        int node = Integer.MAX_VALUE;
        int value = Integer.MAX_VALUE;
        for(int j = 0;j<length;j++){
            if(array1[j]!=0&&array2[j]!=0){
                int max = Math.max(array1[j],array2[j]);
                if(max<value){
                    node = j;
                    value = max;
                }else if(value==max&&j<node){
                    node = j;
                }
            }
        }
        return node==Integer.MAX_VALUE?-1:node;
    }
    @Test
    public void main() {
//        System.out.println(closestMeetingNode(new int[]{1,2,-1}, 0, 2));
//        System.out.println(closestMeetingNode(new int[]{4,4,4,5,1,2,2}, 1, 1));
        System.out.println(closestMeetingNode(new int[]{9,8,7,0,5,6,1,3,2,2}, 1, 6));
//        System.out.println(closestMeetingNode(new int[]{5,3,1,0,2,4,5}, 2, 3));
    }
}
