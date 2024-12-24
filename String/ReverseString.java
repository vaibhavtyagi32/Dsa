package String;

public class ReverseString {
    public static String reverse(String str){
        char ch[]=str.toCharArray();
        String s2="";
        for(int i=ch.length-1;i>=0;i--){
            s2=s2+ch[i];
        }
        return s2;
    }
    public static String reverse2(String sb){
        StringBuilder str = new StringBuilder(sb);
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            char ch=str.charAt(l);
            str.setCharAt(l,str.charAt(r));
            str.setCharAt(r,ch);
            l++;
            r--;
        }
        return str.toString();
    }
    public static String reverse3(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str="hello123";
        System.out.println(reverse3(str));
    }
}
