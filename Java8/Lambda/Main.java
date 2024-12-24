package Java8.Lambda;

public class Main {
    public static void main(String[] args) {
        // 1st way of calling functional interfaces are by creating new class
//        MyIterImpl my=new MyIterImpl();
//        my.sayHello();

        // 2nd way of calling functional interfaces are using anonymous class
//        MyInter my2=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("printing from 1 anonymous class");
//            }
//        };
//        my2.sayHello();

        // 3rd way of calling functional interfaces are lambda expression
//        MyInter my3= ()->{
//            System.out.println("lambda expression ");
//        };
//        my3.sayHello();


//        LengthInter l1=(str)-> str.length();
//        System.out.println(l1.getLength("vaibhav"));
    }
}
