package whiz.quiz_5_loop_constructs;
import java.util.ArrayList;
import java.util.List;

public class q1 {
    public static void main(String [ ] args) {
        List<String>  ints   = new ArrayList<>();

        ints.add("a");
        ints.add("b");
        ints.add("c");

        while(!ints.isEmpty()){     //true
            System.out.print(ints.remove(0));
            //means the whole array list is 0 index
        }
    }
}
