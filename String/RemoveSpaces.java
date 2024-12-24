package String;

public class RemoveSpaces {
    public static String remove(String str){
        return str.replaceAll("\\s","");
    }
    public static void main(String[] args) {
        String str="va i  b h   av";
        String res=remove(str);
        System.out.println(res);
    }
}
