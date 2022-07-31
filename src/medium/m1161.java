package medium;

import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class m1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);//分层标记
        int preSum = Integer.MIN_VALUE;
        int curSum = 0;
        int curDeep = 0;
        int preDeep = 0;
        while(!queue.isEmpty()){
            TreeNode element = queue.remove();
            if(element==null){
                curDeep++;
                if(curSum>preSum){
                    preDeep = curDeep;
                    preSum = curSum;
                }
                curSum = 0;
                if(!queue.isEmpty()){//当队列为空时就不需要再标记了
                    queue.add(null);
                }
            }else{
                if(element.left!=null)
                    queue.add(element.left);
                if(element.right!=null)
                    queue.add(element.right);
                curSum+=element.val;
            }
        }
        return preDeep;
    }
    @Test
    public void main() {
        TreeNode treeNode = TreeNode.generateTreeNode(new Integer[]{-100,-200,-300,-20,-5,-10,null});
        System.out.println(maxLevelSum(treeNode));
    }
}
