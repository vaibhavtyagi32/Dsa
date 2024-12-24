public class LinkedListDemo {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int size;
    public static Node head=null;
    public static Node tail=null;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addInMiddle(int index,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        Node prev=head;
        for(int i=1;i<index-1;i++){
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void removeLast(){
        if(head==null){
            System.out.println("linked listis empty");
        }
        else if(head.next==null){
            head=tail=null;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("linked listis empty");
        }
        else if(head.next==null){
            head=tail=null;
        }
        head=head.next;
        size--;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.addFirst(-1);
        ll.addFirst(-2);
        ll.print();
        ll.removeLast();
        ll.removeLast();
        ll.print();
        ll.removeFirst();
        ll.removeFirst();
        ll.print();
        ll.addInMiddle(2,4);
        ll.print();
        ll.reverse();
        ll.print();
        int res=ll.search(1);
        System.out.println(res);

    }
}
