package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x=9, y=3;
        String name1 = "rekha";
        String name2= "rekha";

        System.out.println(name1.equals(name2)+" ");
        System.out.println(name1==name2); // always false

        int e=3;
        int f=++e * 5 / e-- + --e;
        System.out.println(f);

        int g=6;
        int h=2;
        int i=++h + --g * 3 + 2 * g++ - h-- % --g;
        //   h=3 +  g=5 * 3 + 2 * 5   - 3 % 4
        int s=  3 +   5 * 3 + 2 * 5   - 3%4;
        System.out.println(i);
        System.out.println(s);

    }
}
