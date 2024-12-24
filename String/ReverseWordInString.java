package String;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str="welcome to java world";
        String []s=str.split(" ");
        for(int i=s.length-1;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
