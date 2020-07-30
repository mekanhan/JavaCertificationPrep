package whiz.Methods_and_Encapsulation;


public class Ex1{
    final static int j = 32; //without static j can't be used in line 13

    public static void main(String args[]){
        char c = 'A'; //ASII value of 'A' is 65 and 'a' is 97
        System.out.print((char)calc(c));
    }

    static int calc(int i){
        return (i+j);
    }
}