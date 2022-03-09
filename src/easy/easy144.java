import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));

        list.addAll(preorderTraversal(root.right));
        return list;
    }
    @Test
    public void main() {

    }
}
