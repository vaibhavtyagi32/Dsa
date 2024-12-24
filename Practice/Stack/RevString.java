package Practice.Stack;

import java.util.Stack;

public class RevString {
    public static String revStr(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            st.push(ch);
        }
        StringBuilder res=new StringBuilder("");
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str="hello";
        String res=revStr(str);
        System.out.println(res);
    }
}
