package Practice.Stack;

public class LL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        public static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(head==null){
                return -1;
            }
            int val= head.data;
            head=head.next;
            return val;
        }
        public static int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
