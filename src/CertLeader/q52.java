package CertLeader;

public class q52 {
    int num;

    public static void graceMarks(q52 obj4) {
        obj4.num +=10;
        System.out.println(obj4.num);
    }
    public static void main(String[] args) {
        q52 obj1 = new q52();
        q52 obj2 = obj1;
        q52 obj3 = null;
        obj2.num = 60;
        graceMarks(obj2);

    }
}
