package Recursion;

public class PrintName5Times {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("uday "+n);
        print((n-1));
    }
    public static void main(String[] args) {
        print(5);
    }
}
