package whiz.quiz_4_array;
import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {

        int array[ ] = {2,5,9,5,0,3};
        Arrays.sort(array,2,6);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ "\t");
        }
        System.out.println(array[2]+array[5]);
    }
}
