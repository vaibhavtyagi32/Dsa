package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class OccurenceOfEachCharacters {
    public static String findOccurence(String str){
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        Set<Character> keys=map.keySet();
        String newStr="";
        for(char key:keys){
            newStr=newStr+key+map.get(key)+" ";
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="hello";
        String res=findOccurence(str);
        System.out.println(res);
    }
}
