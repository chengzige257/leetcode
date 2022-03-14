package medium;

public class m337 {//打家劫舍

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //    public int rob(TreeNode root) {//记忆化递归搜索
//        Map<TreeNode,Integer> map = new HashMap<>();
//        return rob(root,map);
//    }
//    public int rob(TreeNode root, Map<TreeNode,Integer> map){
//        if(root==null)
//            return 0;
//        if(root.left==null&&root.right==null)
//            return root.val;
//        if(map.containsKey(root)){
//            return map.get(root);
//        }
//        int val = root.val;
//        int val1 = rob(root.left,map)+rob(root.right,map);
//        if(root.left!=null)
//            val += rob(root.left.left,map)+rob(root.left.right,map);
//        if(root.right!=null)
//            val += rob(root.right.left,map)+rob(root.right.right,map);
//        int max = Math.max(val1,val);
//        map.put(root,max);
//        return max;
//    }
    public int rob(TreeNode root) {
        int[] ret = dp(root);
        return Math.max(ret[0],ret[1]);
    }

    public int[] dp(TreeNode root) {
        if (root == null)
            return new int[]{0, 0};
        if(root.left==null&&root.right==null)
            return new int[]{0,root.val};

        int[] left = dp(root.left);
        int[] right = dp(root.right);
        //不偷当前节点
        int val1 = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        //偷当前节点
        int val2 = root.val+left[0]+right[0];
        return new int[]{val1,val2};
    }

}
