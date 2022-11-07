package easy;

public class easy783 {

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
//    public int minDiffInBST(TreeNode root) {
//        int min = Integer.MAX_VALUE;
//        boolean flag = true;
//        int pre = 0;
//        TreeNode p = root;
//        Stack<TreeNode> stack = new Stack<>();
//        while(p!=null||!stack.empty()){
//            while(p!=null){
//                stack.push(p);
//                p = p.left;
//            }
//
//            if(!stack.isEmpty()){
//
//                p = stack.pop();
//
//                if(flag){
//                    flag = false;
//                }else{
//                    min = Math.min(min,p.val-pre);
//                }
//                pre = p.val;
//                p = p.right;
//            }
//        }
//        return min;
//    }
    int pre;
    int min;
    public int minDiffInBST(TreeNode root){
        pre = -1;
        min = Integer.MAX_VALUE;
        dfs(root);
        return min;
    }

    void dfs(TreeNode root){
        if(root==null)
            return;
        dfs(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}
