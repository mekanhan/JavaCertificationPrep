package CertLeader;

public class Q165 {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;    //100
        int b = ++x;    //102
        int c = x++;    //102
        System.out.println(a + " " + b + " " + c);
        int d = (a<b)  ?   (a<c)     ?   a:    (b<c)    ?   b:      c:      x;
        //    100<102      100<102       100:  102<102      102:    102     100
        //      True       True                 False
        System.out.println(d);
    }
}
