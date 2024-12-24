package Tree;

public class HeightOfBinaryTree {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int rh=count(root.left);
        int lh=count(root.right);
        return rh+lh+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDia=diameter(root.left);
        int rightDia=diameter(root.right);
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int selfDia=leftHeight+rightHeight+1;
        return Math.max(leftDia,Math.max(rightDia,selfDia));
    }
    public static void main(String[] args) {
//                    1
//                  /   \
//                2       3
//              /   \    /  \
//             4     5  6     7

        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(sum(root));
        System.out.println(diameter(root));
    }
}
