package whiz;

public class q3 {
    int j = 10;
    public static void main(String args[]){
        int j=0;
        if(new q3().go(4)) j = 5;
        System.out.print(j);
    }
    boolean go(int y){
        if(y>5) return true;
        else return false;
    }
}
