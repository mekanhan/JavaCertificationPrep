package CertLeader;

public class Q17 {

    public static void main(String[] args) {
        int [][] arr = new int [2][];  // [2] must be 2 cause of 2, arr[0] & arrp[1]
        arr[0] = new int []{1,3,5,7};
        arr[1] = new int []{1,3};
        for (int [] a : arr){
            for (int i : a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
