package String;

public class RemoveSpecialChar {
    public static String remove(String s){
        return s.replaceAll("[^a-zA-Z0-9]","");
    }
    public static void main(String[] args) {
        String str="%$#va&%%#ibhav^%123";
        System.out.println(remove(str));
    }
}
