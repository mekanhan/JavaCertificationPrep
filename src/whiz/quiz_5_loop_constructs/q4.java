package whiz.quiz_5_loop_constructs;

public class q4 {
    public static void main(String[] args) {
        int x = 10;
        while(x>0) {
            do {
                x -= 2;
            } while (x>3);
            x--;
            System.out.print(x);
        }
    }
}
