package CertLeader;

public class Q154 {
    static int count; // should be no static

    public static void displayMsg () {
        System.out.println("Welcome " + count++);
    }

    public static void main(String[] args) {
        Q154.displayMsg();
        displayMsg();
    }
}
