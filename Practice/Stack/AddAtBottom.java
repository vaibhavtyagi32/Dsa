package Practice.Stack;

import java.util.Stack;

public class AddAtBottom {
    public static void addLast(Stack<Integer> st,int element){
        if(st.isEmpty()){
            st.add(element);
            return;
        }
        int top=st.pop();
        addLast(st,element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        addLast(st,5);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
