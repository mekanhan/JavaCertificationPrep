package CertLeader;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q138 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014,7, 31, 1, 1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
