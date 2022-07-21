package easy;

import mians.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class easy145 {//二叉树的后序遍历

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        boolean flag;
        TreeNode pre;
        TreeNode current = root;
        do{
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            pre = null;
            flag = true;
            while(!stack.isEmpty()&&flag){
                current = stack.peek();
                if(current.right==pre){
                    list.add(current.val);
                    current = stack.pop();
                    pre = current;
                }else{
                    current = current.right;
                    flag = false;
                }
            }
        }while(!stack.isEmpty());
        return list;
    }
}
