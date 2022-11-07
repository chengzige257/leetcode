package easy;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class easy144 {//二叉树的前序遍历

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root == null)
//            return new ArrayList<>();
//        List<Integer> list= new ArrayList<>();
//        list.add(root.val);
//        list.addAll(preorderTraversal(root.left));
//
//        list.addAll(preorderTraversal(root.right));
//        return list;
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty()||current!=null){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            if(!stack.isEmpty()){
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }
        return list;
    }
    @Test
    public void main() {

    }
}
