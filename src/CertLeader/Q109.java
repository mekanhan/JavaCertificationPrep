package CertLeader;

public class Q109 {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q109 obj1 = new Q109();
        Q109 obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 + " " + var2);
        System.out.println(obj1.var + " " + obj2.var);
    }
}
