package whiz.Methods_and_Encapsulation;

public class q16 {

    static int i;

    public static void main(String[] args) {
        q16 w1 = new q16();
        q16 w2 = new q16();
        q16 w3 = new q16();
        w1.method();
        w2.method();
        w3.method();
    }

    public void method() {
        while(++i < 4) {
            System.out.print("A");
        }
    }
}
