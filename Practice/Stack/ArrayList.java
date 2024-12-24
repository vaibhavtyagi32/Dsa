package Practice.Stack;

public class ArrayList {
    static class stack{
        static java.util.ArrayList<Integer> st=new java.util.ArrayList<>();
        public static boolean isEmpty(){
            return st.size()==0;
        }
        public static void push(int data){
            st.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=st.get(st.size()-1);
            st.remove(st.size()-1);
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return st.get(st.size()-1);
        }
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
