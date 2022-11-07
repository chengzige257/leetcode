package easy;

import java.util.*;

public class easy653 {//两数之和IV，输入BST
    public class TreeNode {
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
//    public boolean findTarget(TreeNode root, int k) {//97%
//        List < Integer > list = new ArrayList();
//        inorder(root, list);
//        int l = 0, r = list.size() - 1;
//        while (l < r) {
//            int sum = list.get(l) + list.get(r);
//            if (sum == k)
//                return true;
//            if (sum < k)
//                l++;
//            else
//                r--;
//        }
//        return false;
//    }
//    public void inorder(TreeNode root, List< Integer > list) {
//        if (root == null)
//            return;
//        inorder(root.left, list);
//        list.add(root.val);
//        inorder(root.right, list);
//    }
    public boolean findTarget(TreeNode root, int k) {//14%
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        TreeNode p =root;
        while(p!=null||!stack.empty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                p = stack.pop();
                if(set.contains(k-p.val)){
                    return true;
                }
                set.add(p.val);
                p = p.right;
            }
        }
        return false;
    }
}
