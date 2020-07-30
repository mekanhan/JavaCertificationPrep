package whiz.quiz_5_loop_constructs;

public class q5 {
    public static void main(String[] args) {
        byte i = 1, j = 1;
        while (i == 3 && j < 5) {  // since boolean condition is false, entire bracket won't be printed
            System.out.print (i +" "+j+" ");
            i++;
            j += 2;
        }
    }
}
