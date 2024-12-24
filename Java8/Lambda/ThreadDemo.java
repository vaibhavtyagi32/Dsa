package Java8.Lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r1=()->{
            for(int i=0;i<=10;i++){
                System.out.println("Value of i is "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r2=()->{
            for (int j=1;j<=10;j++){
                System.out.println("Value of j*2 is "+j*2);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread thread2=new Thread(r2);
        Thread thread=new Thread(r1);
        thread.run();
        thread2.run();
    }
}
