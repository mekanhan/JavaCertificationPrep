package whiz.quiz_4_array;

public class q8 {
    public static void main(String args[]){
        int[] arr = {1,2,3};
        arr = new int[6]; //from 0-2 throws exception cause it conflicts with line 5.
                          //from 3-6 values are zero
        System.out.println(arr[2]);
    }
}
