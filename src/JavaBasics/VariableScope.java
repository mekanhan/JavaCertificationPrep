package JavaBasics;

public class VariableScope {
    static int myNewInt=5;


    public static void main(String[] args) {
        int myLocalInt = 10;
        {
            int myOtherInt=20;
            System.out.println("myOtherInt= " + myOtherInt);
            myNewInt=1;
            System.out.println(myNewInt);
        }
        System.out.println("myLocalInt= " +myLocalInt);

    }

    public static void myMethod() {
        myNewInt=2;
        System.out.println(myNewInt);

    }
}
