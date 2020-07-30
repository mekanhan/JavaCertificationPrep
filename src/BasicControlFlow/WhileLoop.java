package BasicControlFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int spaceOnHDD = 5;

        while (spaceOnHDD > 0){
            spaceOnHDD--;
            System.out.println("spaceOnHDD= " + spaceOnHDD);
        }

        int x = 2;
        int y = 5;

        int a = 5;
        int b = 7;
        while (a>6){ // will not compile
            b +=2;
            a++;
        }
        a=5;
        System.out.println("a= "+ a);
        a = a>6 ? a++ : b--;
        //false
        //a=b-> a=7
        //b-- -> b=b-1 -> b=6
        //7+6=13
        System.out.println("a= " + a + " b= " + b + " " + (a+b));

    }
}
