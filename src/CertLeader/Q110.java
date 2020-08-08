package CertLeader;

public class Q110 {
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }

    /*supposed to use command line:
    javac Q110.java
    java Q110 1 2 3
    */
}
