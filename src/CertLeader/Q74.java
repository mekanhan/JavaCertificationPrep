package CertLeader;

public class Q74 {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading card");
    }
    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking card");
    }

    public static void main(String[] args) {
        Q74 ex = new Q74();
        int cardNo = 12344;

        try {
            ex.readCard(cardNo);
        } catch (Exception e) {
            System.out.println(e);

        }
        ex.checkCard(cardNo);
    }
}
