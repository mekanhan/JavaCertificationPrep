package Review;
import static java.lang.System.*;

import java.util.*;

public class Ch3_10 {
    public static void main(String[] args) {
        String a ="";
        a+=2;
        a+='c';
        a+=false;
        System.out.println(a.length());
        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");

        // #16
        char [] c = new char[2];
        int length = c.length;

        // #17
        ArrayList d = new ArrayList();
        int length1 = d.size();

        // #21
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (Integer v: values) {
            System.out.println(v);
        }
        // #22
        int [] random = {6,-4,12,0,-10};
        int x=12;
        int y= Arrays.binarySearch(random, x);
        System.out.println("#22 =" + y);

        //#25
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);

        int x1 = Collections.binarySearch(hex, "8");
        int x2 = Collections.binarySearch(hex, "3A");
        int x3 = Collections.binarySearch(hex, "FF");
        System.out.println(x1 + " " + x2 + " " + x3);

        //#27
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one==two){
            System.out.println("A");
        }
        if (one.equals(two)){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }


    }

}
