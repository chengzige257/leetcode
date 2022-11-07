package theSwordSefersToOffer;

import bean.TreeNode;
import org.testng.annotations.Test;

public class offer07 {//重建二叉树

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    TreeNode build(int[] preorder,int preBegin,int preEnd,int[] inorder,int inBegin,int inEnd){
        if(preEnd-preBegin==-1)
            return null;
        if(preEnd-preBegin==0)
            return new TreeNode(preorder[preBegin]);
        int rootVal = preorder[preBegin];
        TreeNode root = new TreeNode(rootVal);
        int m = inBegin;//中序遍历的根节点
        for(int i = inBegin;i<=inEnd;i++){
            if(rootVal==inorder[i]){
                m = i;
            }
        }
        int leftNum = m-inBegin;
        int rightNum = inEnd-m;
        root.left = build(preorder,preBegin+1,preBegin+leftNum,inorder,inBegin,inBegin+leftNum-1);
        root.right = build(preorder,preBegin+1+leftNum,preEnd,inorder,m+1,m+rightNum);
        return root;
    }
    @Test
    public void main() {
        buildTree(new int[]{1,2},new int[]{2,1});
    }
}
