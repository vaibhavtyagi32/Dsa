package String;

public class RotatedString {
    public static boolean check(String s1,String s2){
        boolean isRotated=true;
        String concat=s1+s1;
        if(s1.length()!=s2.length()){
            return false;
        }else if(s1==null || s2==null){
            return false;
        }else{
            isRotated=concat.contains(s2);
        }
        return isRotated;
    }
    public static void main(String[] args) {
        String str="abcd";
        String rotatedStr="cdab";
        boolean res=check(str,rotatedStr);
        System.out.println(res);

    }
}
