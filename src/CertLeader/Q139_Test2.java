package CertLeader;

public class Q139_Test2 {
    public static void main(String[] args) {
        Q139_Product prt = new Q139_Product();
        prt.price = 200;
        double newPrice = 100;

        Q139_Test t = new Q139_Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }
}
