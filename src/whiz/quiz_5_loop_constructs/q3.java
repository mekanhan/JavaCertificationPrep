package whiz.quiz_5_loop_constructs;

public class q3 {
    public static void main(String [ ] args) {
        for (int x = 10; x>5; x++) { // will never stop
            if (x == 16) x -= 11;
            System.out.print(x + " ");
        }
    }

}
