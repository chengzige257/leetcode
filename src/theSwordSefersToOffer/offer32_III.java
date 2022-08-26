package theSwordSefersToOffer;

import mians.TreeNode;

import java.util.*;

public class offer32_III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        int count = 0;
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode element = queue.remove();
            if(element==null){
                if(count%2==1)
                    Collections.reverse(list);
                lists.add(list);
                count++;
                list = new ArrayList<>();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }else{
                if(element.left!=null)
                    queue.add(element.left);
                if(element.right!=null)
                    queue.add(element.right);
                list.add(element.val);
            }
        }
        return lists;
    }
}
