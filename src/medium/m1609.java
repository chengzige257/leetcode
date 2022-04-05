package medium;
import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

public class m1609 {//奇偶数
    //奇数递增，偶数递减，偶数下标为奇数
    public boolean isEvenOddTree(TreeNode root) {
        if(root.left==null&&root.right==null)
            return root.val%2==1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode end = root.right==null?root.left:root.right;
        TreeNode pre = root;
        boolean flag = true;//当标志是true时，表示接下来这行要是奇数递增
        int lastNum = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(flag){
                if(current.val%2==1&&current.val>lastNum){
                    lastNum = current.val;
                }else{
                    return false;
                }
            }else{
                if(current.val%2==0&&current.val<lastNum){
                    lastNum = current.val;
                }else{
                    return false;
                }
            }
            if(current.left!=null){
                end = current.left;
                queue.add(current.left);
            }
            if(current.right!=null){
                end = current.right;
                queue.add(current.right);
            }
            if(current==pre){
                pre = end;
                lastNum=flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
                flag = !flag;
            }
        }
        return true;
    }

    @Test
    public void main() {//1,10,4,3,null,7,9,12,8,6,null,null,2
        TreeNode treeNode6= new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode8= new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(3,treeNode12,treeNode8);
        TreeNode treeNode10 = new TreeNode(10,treeNode3,null);
        TreeNode treeNode7 = new TreeNode(7,treeNode6,null);
        TreeNode treeNode9 = new TreeNode(9,null,treeNode2);
        TreeNode treeNode4 = new TreeNode(4,treeNode7,treeNode9);
        TreeNode treeNode1 = new TreeNode(1,treeNode10,treeNode4);
        System.out.println(isEvenOddTree(treeNode1));


    }
}
