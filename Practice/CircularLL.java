package Practice;

public class CircularLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.next=newNode;
            return;
        }
        newNode.next=head;

    }
    public static void main(String[] args) {
        CircularLL cl=new CircularLL();

    }
}
