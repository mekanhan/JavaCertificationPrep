package JavaBasics;
import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static JavaBasics.Config.*;

public class StaticImportExample {
    public static void main(String[] args) {
        int min = min(5,7);
        System.out.println("min= " + min);
        System.out.println(PI);

        Config.printConfig();

        out.println("name= " + NAME);
        out.println("column count " + MAX_COLUMN_COUNT);
    }
}
