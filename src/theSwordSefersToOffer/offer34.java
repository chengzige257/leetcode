package theSwordSefersToOffer;

import mians.TreeNode;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import static mians.TreeNode.generateTreeNode;


public class offer34 {//二叉树中和为某一值的路径
//    public List<List<Integer>> pathSum(TreeNode root, int target) {//非递归
//        List<List<Integer>> lists = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        boolean flag;
//        TreeNode pre;
//        TreeNode current = root;
//        int sum = 0;
//        do{
//            while(current!=null){
//                stack.push(current);
//                sum+=current.val;
//                if(sum==target&&current.left==null&&current.right==null){
//                    lists.add(stack.stream().map(a->a.val).collect(Collectors.toList()));
//                }
//                current = current.left;
//            }
//            pre = null;
//            flag = true;
//            while(!stack.isEmpty()&&flag){
//                current = stack.peek();
//                if(current.right==pre){
//                    current = stack.pop();
//                    sum=sum-current.val;
//                    pre = current;
//                }else{
//                    current = current.right;
//                    flag = false;
//                }
//            }
//        }while(!stack.isEmpty());
//        return lists;
//    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        dfs(root,target,lists,new ArrayList<>(),0);
        return lists;
    }
    void dfs(TreeNode root, int target, List<List<Integer>> lists, List<Integer> list, int sum){
        list.add(root.val);
        sum+=root.val;
        if(root.left==null&&root.right==null&&sum==target){
            lists.add(new ArrayList<>(list));
        }
        if(root.left!=null){
            dfs(root.left,target,lists,list,sum);
        }
        if(root.right!=null){
            dfs(root.right,target,lists,list,sum);
        }
        sum=sum-list.get(list.size()-1);
        list.remove(list.size()-1);
    }

    @Test
    public void main() {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());//得到栈顶元素
//        System.out.println(list.size());
//        System.out.println(list.pollLast());//弹出栈顶元素
//        System.out.println(list.size());
        pathSum(generateTreeNode(new Integer[]{1,2}),3);
    }
}
