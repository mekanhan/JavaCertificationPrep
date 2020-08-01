package CertLeader;

import java.util.ArrayList;
import java.util.List;

public class q48 {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);

    }
}
