package CertLeader;

public class Q105 {
    int x, y;
    public Q105(int x, int y){
        initialize(x,y);
    }

    private void initialize(int x, int y) {
        this.x = x*y;
        this.y = y*y;
    }

    public static void main(String[] args) {
        int x = 9, y =5;
        Q105 obj = new Q105(x,y);
        System.out.println(x+ " " + y);
    }

}
