package String;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else if(ch=='}' && st.peek()=='{' || ch==')' && st.peek()=='(' || ch==']' && st.peek()=='['){
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str="[{}]";
        System.out.println(isValid(str));
    }
}
