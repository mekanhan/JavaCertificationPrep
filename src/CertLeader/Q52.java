package CertLeader;

public class Q52 {
    int num;

    public static void graceMarks(Q52 obj4) {
        obj4.num +=10;
        System.out.println(obj4.num);
    }
    public static void main(String[] args) {
        Q52 obj1 = new Q52();
        Q52 obj2 = obj1;
        Q52 obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);

    }
}
