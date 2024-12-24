package Practice;

import com.sun.source.tree.BreakTree;

public class NthNodeFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node head2;
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static Node NthNodeFromEnd(int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void deleteNthFromEnd(int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
    public static Node findIntersection(Node head,Node head2){
        Node temp1=head;
        int size1=0;
        while(temp1!=null){
            size1++;
            temp1= temp1.next;
        }
        Node temp2=head2;
        int size2=0;
        while(temp2!=null){
            size2++;
            temp2= temp2.next;
        }
        temp1=head;
        temp2=head2;
        if(size1>size2){
            int steps=size1-size2;
            for(int i=0;i<steps;i++){
                temp1=temp1.next;
            }
        }else{
            int steps=size2-size1;
            for(int i=0;i<steps;i++){
                temp2=temp2.next;
            }
        }
        while (temp1 !=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        g.next=h;
        h.next=d;
        head2=g;
        head=a;
        Node res=findIntersection(head,head2);
        System.out.print(res.data);

    }
}
