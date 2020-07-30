package Operators;

import org.w3c.dom.ls.LSOutput;

public class NumericPromotion {

    public static void main(String[] args) {
        int i = 5;
        double k = 5.7;
        double result = i + k;
        System.out.println(result);

        //casting using int in front of variable
        int result2 = i+(int)k;
        System.out.println(result2);

        //byte can contain values from 1 to 127 and then -128 to - 1
        byte myByte=127;
        int myInt=125; //-128
        byte myByte2=0;
        byte result3= (byte)(myByte+(byte)myInt+(byte)myByte2);
        System.out.println(result3);

        double s=44.25;
        float s1=3.05f;  //if f is missing then it will not compile
        System.out.println(s+s1);

        short s3=14;
        float s4=13f;
        double s5=23.00;
        System.out.println(s3+s4+s5);

    }


}
