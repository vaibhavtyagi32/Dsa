package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String remove(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx=str.indexOf(ch,i+1);
            if (idx==-1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String remove2(String str){
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char)c));
        return sb.toString();
    }
    public static String remove3(String str){
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character ch:set){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "vaibhavud";
        System.out.println(remove3(str)); // Expected output: "vaibh"
    }
}
