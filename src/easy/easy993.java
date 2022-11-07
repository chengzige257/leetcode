package easy;

import org.testng.annotations.Test;

public class easy993 {//二叉树的堂兄弟节点
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
    class pair{
        int deep;
        int father;
        pair(int deep,int father){
            this.deep = deep;
            this.father = father;
        }
    }


    public boolean isCousins(TreeNode root, int x, int y) {
        pair[] a = new pair[2];
        a[0] = new pair(0,0);
        a[1] = new pair(0,0);
        findNum(root,x,y,a,0);
        return a[0].deep==a[1].deep&&a[0].father!=a[1].father;
    }

    boolean findNum(TreeNode root,int x,int y,pair[] a,int deep){
        if(root==null)
            return false;
        if(root.val == x){
            a[0].deep = deep;
            return true;
        }
        if(root.val == y){
            a[1].deep = deep;
            return true;
        }
        if(findNum(root.left,x,y,a,deep+1)){
            if(a[0].father==0){
                a[0].father = root.val;
            }else{
                a[1].father = root.val;
            }
            return false;
        }
        if(findNum(root.right,x,y,a,deep+1)){
            if(a[0].father==0){
                a[0].father = root.val;
            }else{
                a[1].father = root.val;
            }
            return false;
        }
        return false;
    }


    @Test
    public void main() {

    }

}
