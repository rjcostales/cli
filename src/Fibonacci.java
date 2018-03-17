import java.util.Date;

import rjsc.Time;

public class Fibonacci {

    static long fibonacci(long n) {

        if (n > 1)
            return fibonacci(n - 1) + fibonacci(n - 2);
        else
            return n;
    }

    public static void main(String argv[]) {

        Date start = new Date();
        long n = fibonacci(47);
        Date end = new Date();

        System.out.println(n);
        Time.printHoursMinutesSecond(end.getTime() - start.getTime());
    }
}