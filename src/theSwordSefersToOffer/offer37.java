package theSwordSefersToOffer;

import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.*;

public class offer37 {
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        if(root==null){
//            return "";
//        }
//        List<Integer> list = inorderTraversal(root);
//        String inorder = list.stream().map(Object::toString).reduce((a, b)->a+","+b).get();
////        System.out.println(inorder);
//
//        list = preorderTraversal(root);
//        String preorder = list.stream().map(Object::toString).reduce((a, b)->a+","+b).get();
////        System.out.println(preorder);
//        return inorder+";"+preorder;
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if("".equals(data))
//            return null;
//        String[] inAndPre = data.split(";");
//        int[] inOrder = Arrays.stream(inAndPre[0].split(",")).mapToInt(Integer::valueOf).toArray();//4,2,5,1,6,3,7
//        int[] preOrder = Arrays.stream(inAndPre[1].split(",")).mapToInt(Integer::valueOf).toArray();//1,2,4,5,3,6,7
//        TreeNode root = dfs(inOrder,0,inOrder.length,preOrder,0,preOrder.length);
//        return root;
//    }
//    TreeNode dfs(int[] inOrder,int start1,int end1,int[] preOrder,int start2,int end2){
//        if(start1>=end1||start2>=end2)
//            return null;
//        TreeNode treeNode = new TreeNode(preOrder[start2]);
//        int i = start1;
//        while(inOrder[i]!=preOrder[start2]){
//            i++;
//        }
//        treeNode.left = dfs(inOrder,start1,i,preOrder,start2+1,start2+1+i-start1);
//        treeNode.right = dfs(inOrder,i+1,end1,preOrder,start2+1+i-start1,start2-start1+end1);
//        return treeNode;
//    }
//
//    public List<Integer> inorderTraversal(TreeNode root) {//中序遍历非递归
//        if(root == null)
//            return new ArrayList<>();
//        List<Integer> list= new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = root;
//        while(!stack.isEmpty()||current!=null){
//            while(current!=null){
//                stack.push(current);
//                current = current.left;
//            }
//            if(!stack.isEmpty()){
//                current = stack.pop();
//                list.add(current.val);
//                current = current.right;
//            }
//        }
//        return list;
//    }
//
//    public List<Integer> preorderTraversal(TreeNode root) {//先序遍历非递归
//        if(root == null)
//            return new ArrayList<>();
//        List<Integer> list= new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode current = root;
//        while(!stack.isEmpty()||current!=null){
//            while(current!=null){
//                list.add(current.val);
//                stack.push(current);
//                current = current.left;
//            }
//            if(!stack.isEmpty()){
//                current = stack.pop();
//
//                current = current.right;
//            }
//        }
//        return list;
//    }
//-----------------------------------------------------------------------------------------------------
    //以上测试未通过，例如情况3，2，4，3，两个节点值相同，然后前序和中序遍历结果都是3234，但是3的位置没有区分存储。
//-----------------------------------------------------------------------------------------------------

    public String serialize(TreeNode root) {
        if(root == null){
            return "null,";
        }
        String res = root.val + ",";
        res += serialize(root.left);
        res += serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<String>();
        for(int i = 0; i < arr.length; i++){
            queue.offer(arr[i]);
        }
        return help(queue);
    }
    public TreeNode help(Queue<String> queue){
        String val = queue.poll();
        if(val.equals("null")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = help(queue);
        root.right = help(queue);
        return root;
    }
    @Test
    public void main() {
        TreeNode deserialize = deserialize(serialize(TreeNode.generateTreeNode(new Integer[]{3,2,4,3})));
        System.out.println(1);
    }
}
