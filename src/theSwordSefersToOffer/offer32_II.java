package theSwordSefersToOffer;


import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode element = queue.remove();
            if(element==null){
                lists.add(list);
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
