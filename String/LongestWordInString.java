package String;

public class LongestWordInString {
    public static String longest(String str){
        int max=-1;
        String []s=str.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].length()>max){
                max=i;
            }
        }
        return s[max];
    }
    public static void main(String[] args) {
        String s="ram is a good boy";
        System.out.println(longest(s));
    }
}
