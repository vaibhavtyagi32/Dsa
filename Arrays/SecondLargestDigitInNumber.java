package Arrays;

public class SecondLargestDigitInNumber {
    public static int second(int n){
        int smax=-1;
        int max=-1;
        while(n>0){
            int temp=n%10;
            if(temp>max){
                smax=max;
                max=temp;
            }
            if(temp<max && smax<temp){
                smax=temp;
            }
            n=n/10;
        }
        return smax;
    }
    public static void main(String[] args) {
        int n=12345;
        int res=second(n);
        System.out.println(res);
    }
}
