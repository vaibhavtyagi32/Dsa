package Java8.DateAndTimeApi;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate customDate=LocalDate.of(2004,2,27);
        System.out.println(customDate);
        LocalDate pastDate=today.minusDays(1);
        System.out.println(pastDate);
        LocalDate futureDate=today.minusMonths(100);
        System.out.println(futureDate);
        if(today.isAfter(pastDate)){
            System.out.println("trueeeeeeeeeeeeeee");
        }else{
            System.out.println("falseeeeeeeeeeeeeeeee");
        }
    }
}
