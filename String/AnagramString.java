package String;

import java.util.Arrays;

public class AnagramString {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char []str1=s1.toCharArray();
        char []str2=s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        boolean res=isAnagram(s1,s2);
        System.out.println("string are anagarm "+res);
    }
}
