package String;

public class CompareTwoString {
    public static void main(String[] args) {
        String str1="Vaibhav";
        String str2="Vaibhav";
        boolean isCompare=true;
        if(str1.length()!=str2.length()){
            isCompare=false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                isCompare=false;
                break;
            }
        }
        if(isCompare){
            System.out.println("string are equal");
        }else{
            System.out.println("string are not equal");
        }
    }
}
