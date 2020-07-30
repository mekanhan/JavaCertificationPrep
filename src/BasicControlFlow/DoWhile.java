package BasicControlFlow;

public class DoWhile {

    public static void main(String[] args) {

        int a =0;

        do {
            a++;
        }
        while (false);
        System.out.println("a= " + a);

        int x = 20;
        while (x>10) x--;
        System.out.println("x= " + x); //prints only 10

        int x2 = 20;

        do x2--;
        while(x2>10);
        System.out.println("x2= "+x2); //prints only 10

        int y = 10;
        int z = 5;
        while (y<20) {
            y++;
        }
        z+=2; // not in while loop if no brackets
        y +=10; // not in while loop if no brackets

        System.out.println("x= " + x + " y= " + y + " z= " + z);
    }
}
