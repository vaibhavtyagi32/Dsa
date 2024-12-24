package String;

import java.util.HashMap;
import java.util.Set;

public class NumberOfCharacter {
    public static void count(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        Set<Character> keys=map.keySet();
        for(char key:keys){
            System.out.print(key+""+map.get(key));
        }
    }
    public static void main(String[] args) {
        String str="aabbbccc";
        count(str);
    }
}
