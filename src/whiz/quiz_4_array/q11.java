package whiz.quiz_4_array;

public class q11 {
    public static void main(String[] args) {
        int i = 2; //the length is 2 which is array[1]
        char array[] = new char[i];
        array[0] = 65;
        array[1] = 66;
//        array[2] = 67; // this goes out of bound
        System.out.print(array[2]); //this as well goes out of bound
    }
}
