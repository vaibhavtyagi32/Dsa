package Practice.Stack;

import java.util.Stack;

public class Jcf {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
