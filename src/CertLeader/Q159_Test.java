package CertLeader;

public class Q159_Test {
    public static void main(String[] args) {
        Q159_Employee e1 = new Q159_Employee();
        Q159_Employee e2 = new Q159_Employee("Jack", 50);
        Q159_Employee e3 = new Q159_Employee("Chloe", 50, 5000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();

    }
}
