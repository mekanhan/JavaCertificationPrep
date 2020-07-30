package whiz.Methods_and_Encapsulation;

public class Overloading {

    public static void main(String args[]){
        B ab = new B();     // if A ab = new B(), then it wouldn't compile
        System.out.println(ab.calc(2.0, 3.1));
    }
}

class A{
    public int calc(int a, int b){
        return a+b;
    }
}

class B extends A{
    public double calc(double a, double b){
        return a+b;
    }
}
