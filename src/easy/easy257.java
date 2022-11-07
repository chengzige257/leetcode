package easy;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class easy257 {

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

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public void paths(TreeNode root , String path , LinkedList<String> paths){//100%
        if(root != null){
            path += Integer.toString(root.val);
            if(root.left == null && root.right == null)
                paths.add(path);
            else{
                path += "->";
                paths(root.left,path,paths);
                paths(root.right,path,paths);
            }
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        paths(root,"",paths);
        return paths;
    }




//    List<String> res = new ArrayList<>();    // 存储结果
//    LinkedList<String> path = new LinkedList<>();  // 存储单个路径
//
//    public List<String> binaryTreePaths(TreeNode root) {
//        traverse(root);
//        return res;
//    }
//
//    // 二叉树的遍历框架
//    public void traverse(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        // 前序遍历位置
//        path.add(String.valueOf(root.val));
//        // 到叶子节点就返回
//        if (root.left == null && root.right == null) {
//            // 添加到结果中
//            res.add(String.join("->", path));
//        }
//        traverse(root.left);
//        traverse(root.right);
//        path.removeLast();
//    }

    
    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode2.right = treeNode5;
        treeNode2.left = treeNode6;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        List<String> strings = binaryTreePaths(treeNode1);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
