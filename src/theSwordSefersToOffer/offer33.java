package theSwordSefersToOffer;

import java.util.Stack;

public class offer33 {
//    public boolean verifyPostorder(int[] postorder) {
//        return dfs(postorder,0,postorder.length);
//    }

    public boolean dfs(int[] postorder,int start,int end){
        if(start==end-1)
            return true;
        int root = postorder[end-1];
        int i = start;
        while(postorder[i]<root)
            i++;
        int j = i;
        while(j<end){
            if(postorder[j]<root)
                return false;
            j++;
        }
        return dfs(postorder,start,i)&&dfs(postorder,i,end-1);
    }

    public boolean verifyPostorder(int[] postorder) {
        int root = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = postorder.length-1;i>=0;i--){
            if(postorder[i]>root)
                return false;
            while(!stack.isEmpty()&&stack.peek()>postorder[i]){
                root = stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}
