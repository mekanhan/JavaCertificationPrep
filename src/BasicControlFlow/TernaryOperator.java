package BasicControlFlow;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

//        y = x > 5 ? 2 * x;
        y = (x>5) ? (2 * x) : (4 * x);
        // ? represents if the statement is true then evaluate next expression
        // : represents else
//      y = if x>5, then 2*x, else 4*x
        System.out.println("y= " + y);

        y = 1;
        System.out.println(y>5 ? 10 : "Test");
//        int myInt = y < 10 ? 5 : "Test";  // does not compile because Test cannot be String

        int a=1;
        int b=1;
        int c=a<10 ? a++ : b++;
        System.out.println(a + ", " + b + ", " + c);

        int d=1;
        int e=2;
        int f=3;

        if (d<10){
            f = d++< 1 ? e++ : f++;
            //d=2, e=2, f=3 it always will stay 3 because f=f can not change
        }
        else {
            f = (d+e) < 2 ? d++ : e++;
        }
        System.out.println(d + ", " + e + ", " + f);







    }
}
