package theSwordSefersToOffer;

import bean.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32_I {//从上到下打印二叉树
    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if(poll.left!=null)
                queue.add(poll.left);
            if(poll.right!=null)
                queue.add(poll.right);
        }

        return list.stream().mapToInt(a->a).toArray();
    }
    @Test
    public void main() {

    }
}
