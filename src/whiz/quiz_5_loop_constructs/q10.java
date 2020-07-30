package whiz.quiz_5_loop_constructs;

public class q10 {
    public static void main(String [ ] args) {
        int x = 0;
        do{
            System.out.print(x);
        }while(x++ < 2);    //while controls x++ until x=<2, which is 012

        for(x = 0;x++<2;) System.out.print(x); //for loop controls x =<2, which is 12
        //print x begins with 1 until 2 when x=0
    }
}
