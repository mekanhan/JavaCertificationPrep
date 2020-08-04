package CertLeader;

import java.util.Base64;

public class Q95_DerivedB extends Q95_DerivedA{
    public void test(){
        System.out.println("Derived B ");
    }
    public static void main(String[] args) {
        Q95_Base b1 = new Q95_DerivedB();
        Q95_Base b2 = new Q95_DerivedA();
        Q95_Base b3 = new Q95_DerivedB();
        b1 = (Q95_Base) b3;                  // no need to cast, useless
        Q95_Base b4 = (Q95_DerivedA) b3;    // no need to cast, useless
        b1.test();
        b4.test();
    }
}
