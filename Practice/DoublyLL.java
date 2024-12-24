package Practice;

public class DoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public static void removeFirst(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        head=head.next;
        head.prev=null;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dl=new DoublyLL();
        addFirst(3);
        addFirst(2);
        addFirst(1);
        print();
        removeFirst();
        print();

    }
}
