package CertLeader;

public class Q53 {
    public static void main(String[] args) {
        double discount = 0;
        int qty = 95;
//        if (qty >= 90) {
//            discount = 0.5;
//        }
//        if (qty >80 && qty <90){
//            discount=0.2;
//        }
//        discount = (qty >=90) ? 0.5 : 0;
        discount = (qty <89) ? 0.2 : 0;
        System.out.println(discount);

    }
}
