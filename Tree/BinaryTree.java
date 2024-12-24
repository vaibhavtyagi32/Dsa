package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Tree{
        static int idx=-1;
        public static Node buildTree(int []nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"->");
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        Queue<Node> pq=new LinkedList<>();
        pq.add(root);
        pq.add(null);
        while(!pq.isEmpty()){
            Node currNode=pq.remove();
            if(currNode==null){
                System.out.println();
                if(pq.isEmpty()){
                    break;
                }else {
                    pq.add(null);
                }
            }
            else{
                System.out.print(currNode.data+"->");
                if(currNode.left!=null){
                    pq.add(currNode.left);
                }
                if(currNode.right!=null){
                    pq.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree=new Tree();
        Node root=tree.buildTree(nodes);
        System.out.println("====================PreOrder====================");
        preOrder(root);
        System.out.println();
        System.out.println("====================PostOrder====================");
        postOrder(root);
        System.out.println();
        System.out.println("====================InOrder=======================");
        inOrder(root);
        System.out.println();
        System.out.println("===============LevelOrder=========================");
        levelOrder(root);

    }
}
