package easy;

import org.testng.annotations.Test;

import java.util.Stack;

public class easy572 {//另一颗树的子树

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

//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {//错误方法
//        int[] a = new int[2001];
//        int[] b = new int[1001];
//        dfs(root, a);
//        dfs(subRoot, b);
//        int[] arr = new int[a[0] + 1];
//        int max = 0;
//        for (int i = 1; i <= b[0]; i++) {
//            for (int j = a[0]; j >= 1; j--) {
//                if (b[i] == a[j]){
//                    if(j==1)
//                        arr[j] = 1;
//                    else{
//                        arr[j] = arr[j-1]+1;
//                    }
//                    if(arr[j]>max){
//                        max=arr[j];
//                    }
//                }
//            }
//        }
//        return max==b[0];
//    }
//
    void dfs(TreeNode root, int[] a) {
        if (root == null) {
            return;
        }
        dfs(root.left, a);
        a[++a[0]] = root.val;
        dfs(root.right, a);
    }

//    void findRoot(TreeNode root, int[] a,int num) {
//        if (root == null) {
//            return;
//        }
//        findRoot(root.left, a,num);
//        if(root.val==num){
//            dfs(root,a);
//        }
//        findRoot(root.right, a,num);
//    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){//执行耗时:7 ms,击败了5.56% 的Java用户
        int[] a = new int[2001];
        int[] b = new int[1001];
        dfs(subRoot, b);
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while(p!=null||!stack.empty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                p = stack.pop();
                if(p.val==subRoot.val){
                    boolean flag = true;
                    dfs(p,a);
                    for(int i=0;i<=a[0];i++){
                        if(a[i]!=b[i]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        return true;
                    }
                }
                p=p.right;
                a[0] = 0;
            }
        }
        return false;
    }

    @Test
    public void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode3.right = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        int[] ints = new int[2001];
//        dfs(treeNode1, ints);
        for (int i = 1; i <= ints[0]; i++) {
            System.out.println(ints[i]);
        }
    }
}
