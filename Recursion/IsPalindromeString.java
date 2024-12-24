package Recursion;
public class IsPalindromeString {
    public static boolean isPalindrome(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        return isPalindrome(str,l+1,r-1);
    }
    public static void main(String[] args) {
        String str="racecar";
        boolean res=isPalindrome(str,0,str.length()-1);
        System.out.println(res);
    }
}
