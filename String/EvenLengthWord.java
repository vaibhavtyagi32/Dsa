package String;

public class EvenLengthWord {
    public static void main(String[] args) {
        String s="hell world";
        for(String str:s.split(" ")){
            if(str.length()%2==0){
                System.out.println(str+"->"+str.length());
            }
        }
    }
}
