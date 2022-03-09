import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class easy720 {//词典中最长的单词


    @Test
    public void main() {
        System.out.println(longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }


    public String longestWord(String[] words) {
        Tree tree = new Tree();
        for (String word : words) {
            tree.insert(word);
        }
        tree.getLongestWord(tree.root,0);
        return tree.res;
    }


    class Tree{
        boolean flag = false;
        Node root = new Node();
        String res = "";
        int maxLength = 0;
        void insert(String s){
            Node current = root;
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if(current.nodes[aChar-'a']==null){
                    Node node = new Node();
                    current.nodes[aChar-'a']=node;
                }
                current = current.nodes[aChar-'a'];
            }
            current.isEnd=true;
            current.s = s;
        }

        void getLongestWord(Node root,int deep){
            if(root==null||deep!=0&&!root.isEnd)
                return;
            if(deep>maxLength){
                maxLength = root.s.length();
                res = root.s;
            }
            for(int i=0;i<26;i++){
                getLongestWord(root.nodes[i],deep+1 );
            }

        }
    }

    class Node{
        String s;
        boolean isEnd;
        Node[] nodes;
        Node(){
            isEnd = false;
            nodes = new Node[26];
        }
    }

}
