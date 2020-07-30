package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        int x = (int)1.0;  // casting double value to int
        short y = (short)19812345; // casting long value to short
        int z = (int)9f; //casting float value to int
        long t = 1923254654651684L; // adding letter L enables to keep larger value
        System.out.println("x= " + x + '\n' + "y= " + y + '\n' + z + '\n' + "t= " + t);

        //byte can contain values (from 1 to 127) and (then -128 to - 1)
        byte myByte=127;
        byte myByte2=-128;
        byte myByte3=-121;
        System.out.println("myByte1= " + myByte+'\n' + "myByte2= " + myByte2+'\n' + "myByte3"+myByte3);

        short a= 10;
        short b= 15;
        // short c= (short)a * (short) b;  will not work because java auto promotes both short to int
        // short d = a*b;       same here. Basically, short * short = int
        short e= (short)(a*b);
        System.out.println(e);

    }
}
