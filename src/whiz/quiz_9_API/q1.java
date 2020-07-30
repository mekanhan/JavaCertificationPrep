package whiz.quiz_9_API;

public class q1 {
    public static void main(String [ ] args) {
        StringBuilder sb = new StringBuilder(10);
        StringBuilder sb1 = new StringBuilder("BC12"); //one letter =17, two lett=18 ...
        System.out.println(sb.capacity()+sb1.capacity()); //10
    }
}
