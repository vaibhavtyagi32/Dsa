package String;

public class ReplaceCharWithOccurence {
    public static String replace(String str,char ch){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==ch){
                sb.append(count);
                count++;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="opentext";
        char ch='t';
        String res=replace(str,ch);
        System.out.println(res);
    }
}
