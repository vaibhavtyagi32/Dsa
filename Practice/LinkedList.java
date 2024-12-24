package Practice;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size=0;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            System.out.println("First Node is added");
            return;
        }
        newNode.next=head;
        head=newNode;
        System.out.println("A new node added at front");
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            System.out.println("First Node is added");
            return;
        }
        tail.next=newNode;
        tail=newNode;

        System.out.println("new node added at last");
    }
    public static void addAtIndex(int data,int index){
        Node newNode=new Node(data);
        if(index==0){
            addFirst(data);
            return;
        }
        size++;
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void print(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static int removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        size--;
        int value=head.data;
        head=head.next;
        return value;
    }
    public static int removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        size--;
        Node temp=head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        int value=tail.data;
        temp.next=null;
        tail=temp;
        return value;
    }
    public static int search(int data){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==data){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public static int helper(int key,Node head){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(key,head.next);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public static int searchByRec(int key){
        return helper(key,head);
    }
    public static void reverse(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public Node findMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMid();
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static boolean isCheck(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            System.out.println("No cycle found in linked list");
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCheck());
        removeCycle();
        System.out.println(isCheck());
    }
}
