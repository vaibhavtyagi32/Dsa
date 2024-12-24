package String;

public class CountWordsInString {
    public static int chcek(String str){
        int count=0;
        if(str.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="welcome to java world";
        int count=0;
        for(String s:str.split(" ")){
            count++;
        }
        System.out.println("number of word is "+count);
        System.out.println("=========================");
        System.out.println(chcek(str));
    }
}
