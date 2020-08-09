package CertLeader;

public class Q163 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
//        String s4 = (String) s3; // numeric variables cant be casted to String
        System.out.println("Sum " + s3);
    }
}
