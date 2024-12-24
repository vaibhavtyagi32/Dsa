package String;

import java.util.Arrays;

public class SortString {
    public static String sort(String str){
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static String sort2(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="bca";
        System.out.println(sort2(str));

    }
}
