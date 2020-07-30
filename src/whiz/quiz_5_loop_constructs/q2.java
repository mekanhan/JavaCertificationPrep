package whiz.quiz_5_loop_constructs;

public class q2 {
    public static void main(String [ ] args) {

        int ar[ ][ ] = {{1,0},{-4},{3,1}};

        f1: for(int[ ] a : ar) {    //inner length which is 2
            for (int x = 0; x < a.length; x++) {
                if (a[x] < 0) break f1; //limited to index 0
                System.out.print(a[x]);
            }
        }
    }
}
