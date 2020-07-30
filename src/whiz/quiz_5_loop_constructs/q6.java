package whiz.quiz_5_loop_constructs;

public class q6 {

    public static void main(String [ ] args) {
        int x = 0;
        while ((x = 0) <= 1) { //while assigns x=0 over and over as result
            System.out.print(x); // 0 will be printed endlessly
            x++;
        }
    }
}
