package Operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean b1 = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a && c; // true
        boolean f = a || b; // true
        boolean g = b || b1; // false


        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("g= " + g);

        int j = 4;
        boolean k = false && (j++ < 4); // false before even executing
        boolean l = (j--==4) && !k;     // true and true even w/o post increment

        //post increments/decrements apply after expression

        System.out.println("k= " + k);
        System.out.println("l= " + l);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false); // as long as both values are not the same then it is true. otherwise false

        System.out.println("x= " + x);

    }

}
