package String;
import java.util.LinkedHashMap;


public class LongestSubStringWithoutReaptingChar {
    public static void longestSubstring(String str){
        int longestSubstringLength=0;
        String longestSubstring=null;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        char []arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size()>longestSubstringLength){
                longestSubstringLength=map.size();
                longestSubstring=map.keySet().toString();
            }
        }
        System.out.println(longestSubstring);
    }
    public static void main(String[] args) {
        String str="abcdaefgh";
        longestSubstring(str);
    }
}
