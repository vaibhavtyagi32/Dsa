package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s1,String s2){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="race";
        String s2="cate";
        System.out.println(isAnagram(s1,s2));
    }
}
