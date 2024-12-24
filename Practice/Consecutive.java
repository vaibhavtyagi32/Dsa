package Practice;

public class Consecutive {
    public static int findOccurence(String str){
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(str.charAt(i)==str.charAt(i+1)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="aaabbcdee";
        int res=findOccurence(str);
        System.out.println(res);
    }
}
