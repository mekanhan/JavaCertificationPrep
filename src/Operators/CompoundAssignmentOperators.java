package Operators;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x=2;
        int z=3;

        x= x * z; // simple assignment          // result x=6
        x *= z; // shorter form of x = x * z    // x=6*3=18

        System.out.println("x= " + x);

//         int a +=5;  will not compile because it doesn't have previous value

        //without explicit cast
        long a = 10;
        int b = 4;
//        b = b * a; will not compile because java promotes b to long data type
//        b= (long)(b*a);  will not compile
//        b= (long)b*a;  will not compile
//        b will ONLY compile to int
        b = (int)(a*b);
        System.out.println(b);

        long c = 4;
        long d = (c = 2); // changes c value to 2
        System.out.println("c= " + c + " d= " + d);     //c=2  d=2

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2); // -(h=-1)
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("h= " + h);
        System.out.println("f= " + f);
        System.out.println("i= " + i);

    }
}
