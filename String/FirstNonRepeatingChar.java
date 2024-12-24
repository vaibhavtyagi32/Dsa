package String;

import java.util.HashMap;
import java.util.Set;

public class FirstNonRepeatingChar {
    public static void find(String str){

        for(int i=0;i<str.length();i++){
            boolean unique=true;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
        System.out.println("not found any charcter");
    }
    public static void find2(String str){
        HashMap<Character,Integer> map=new HashMap<>();
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
        for(char key:keys){
            if(map.get(key)==1){
                System.out.println(key);
                break;
            }
        }
        System.out.println("not found any charcter");
    }
    public static void main(String[] args) {
        String str="aabccdbdee";
        find2(str);
    }
}
