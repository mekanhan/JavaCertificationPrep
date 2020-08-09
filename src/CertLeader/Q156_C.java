package CertLeader;

public class Q156_C extends Q156_A {
    public void test(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        Q156_A b1 = new Q156_A();
        Q156_A b2 = new Q156_C();
//        Q156_B b4 = new Q156_B();

        b1 = (Q156_A) b2;
        Q156_A b3 = (Q156_B) b2;    // if b2 is casted then it throws exception
                                    // When both sides are A for example, b3 can't be casted
        b1.test();
        b3.test();

    }
}
