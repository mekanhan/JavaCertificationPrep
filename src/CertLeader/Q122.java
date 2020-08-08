package CertLeader;

import java.time.LocalDate;

public class Q122 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012,1,30);
        date.plusDays(10);
        date=date.plusMonths(10);
        System.out.println(date);
    }
}
