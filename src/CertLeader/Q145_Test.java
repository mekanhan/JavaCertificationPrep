package CertLeader;

import java.util.ArrayList;
import java.util.List;

public class Q145_Test {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Q145_Patient p2 = new Q145_Patient ("Mike");
        ps.add(p2);

        int f = ps.indexOf(new Q145_Patient("Mike"));

        System.out.println(f);
    }

}
