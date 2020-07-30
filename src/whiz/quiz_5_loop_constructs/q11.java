package whiz.quiz_5_loop_constructs;

public class q11 {
    public static void main(String [ ] args) {
        for (int x = 1; x < 10; x++) {

            if (x % 2 == 1) continue;
            // continue ignores odd "if" loop which as result prints even numbers
            // continue statement does inverse of "if" loop - even
            System.out.print(x);

        }
    }
}
