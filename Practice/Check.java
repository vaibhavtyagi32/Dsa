package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {
    public static void swap(int []arr){
        int i=0;
        int j=arr.length-1;
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    public static int uppercaseCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=65;j<92;j++){
                if(ch==j){
                    count++;
                }
            }
        }
        return count;
    }
    public static int sum(int n){
        int temp=n/10;
        temp=reverse(temp);
        int temp2=temp/10;
        int sum=0;
        while(temp2>0){
            sum=sum+temp2 % 10;
            temp2=temp2/10;
        }
        return sum;
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;

        }
        return rev;
    }
    public static double average(int []arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                list.add(arr[i]);
            }
        }
        int sum=0;
        for(int item:list){
            sum=sum+item;
        }
        System.out.println(sum);
        System.out.println(list.size());
        System.out.println(list);
        return sum/list.size();
    }
    public static boolean isPrime(int m){
        for(int i=2;i<=m/2;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8};
//        swap(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(uppercaseCount("abcABCdefg"));
//        System.out.println(sum(65784));
        System.out.println(average(arr));


    }
}
