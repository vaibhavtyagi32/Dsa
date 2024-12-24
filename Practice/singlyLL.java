package Practice;

public class singlyLL {
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head=null;
    private Node tail=null;
    private int size=0;
    public void insertFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        if(tail==null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int data,int index){
        if(index==0){
           insertFirst(data);
           return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        Node node=new Node(data);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return -1;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("linked list is empty");
            return -1;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int value=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }
    public void display(){
        if(size==0){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        singlyLL ll=new singlyLL();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.display();
        ll.insertLast(4);
        ll.insertLast(5);
        ll.display();
        ll.insert(55,2);
        ll.display();
        ll.removeFirst();
        ll.display();
        System.out.println(ll.removeLast());
        ll.display();

    }

}
