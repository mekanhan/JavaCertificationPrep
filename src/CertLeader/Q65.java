package CertLeader;

public class Q65 {
    public static String maskCC (String creditCard) {
        String x = "XXXX-XXXX-XXXX-";

//        StringBuilder sb = new StringBuilder(x);
//        sb.append(creditCard, 15, 19);
//        return sb.toString();
//        return x + creditCard.substring(15,19);
        StringBuilder sb = new StringBuilder(creditCard);
        StringBuilder s = sb.delete(0,15).insert(0,x);
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}
