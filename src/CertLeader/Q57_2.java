package CertLeader;

public class Q57_2 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new Q57_1("Java SE 8"));

        //q62
        try {
            int n=5;
            int a = 0;
            int d = n/a;
        }
        catch (ArithmeticException e){
//            d =0;
        } catch (Exception e){
            System.out.println("Invalid calc");
        }
//        System.out.println(d);

    }
}
