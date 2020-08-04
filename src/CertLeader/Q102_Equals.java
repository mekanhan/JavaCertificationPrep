package CertLeader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q102_Equals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        String a = "Java";
        if (sb.toString().equals(s)){
            System.out.println("March 1");
        }
        else if (s.equals(sb)){
            System.out.println("March 2");
        }
        else {
            System.out.println("No Match");
        }

    }

}
