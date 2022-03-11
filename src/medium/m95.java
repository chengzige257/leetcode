package medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class m95 {//不同的二叉搜索树Ⅱ
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

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new LinkedList<>();
        if(n==0){
            list.add(null);
        }
        return generateTrees(1,n);
    }

    List<TreeNode> generateTrees(int begin,int end){
        List<TreeNode> list = new LinkedList<>();
        if(begin>end){
            list.add(null);
            return list;
        }

        for(int i = begin;i<=end;i++){
            List<TreeNode> left = generateTrees(begin,i-1);
            List<TreeNode> right = generateTrees(i+1,end);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    list.add(root);
                }
            }
        }
        return list;
    }

    
    @Test
    public void main() {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        List<TreeNode> list = new ArrayList<>();
//        list.add(treeNode1);
//        treeNode1.left = treeNode2;
//        list.add(treeNode1);
//        System.out.println(1);
        List<TreeNode> treeNodes = generateTrees(1, 1);
        System.out.println(treeNodes.size());
    }
}
