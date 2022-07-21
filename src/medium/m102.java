package medium;

import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.*;

public class m102 {
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
    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(20,treeNode2,treeNode1);
        TreeNode treeNode4 = new TreeNode(9,null,null);
        TreeNode treeNode5 = new TreeNode(3,treeNode4,treeNode3);
        List<List<Integer>> list = levelOrder(treeNode5);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
