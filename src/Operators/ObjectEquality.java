package Operators;

public class ObjectEquality {
    public static void main(String[] args) {
        //comparing objects
        Integer myInteger= 127;
        Integer myAnotherInteger= 127;

        System.out.println("127 = 127 " + myInteger.equals(myAnotherInteger)); // true
        System.out.println("127 = 127 " + (myInteger == myAnotherInteger)); // true.  dont make String line

        Integer myInteger1= 128;
        Integer myAnotherInteger1= 128;
        System.out.println("128 = 128 " + myInteger1.equals(myAnotherInteger1)); // true
        System.out.println("128 = 128 " + (myInteger1 == myAnotherInteger1)); // false

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;
        System.out.println("int1==int2 " + (int1==int2)); // false
        System.out.println("int1==int3 " + (int1==int3)); // false
        System.out.println("int2==int3 " + (int2==int3)); // false

            // Above, all false because object reference is different.
            // == refers to object reference rather if the object same
            // basically, comparing hash values.

        System.out.println("int1.equals(int2): " + int1.equals(int2)); // true
        System.out.println("int1.equals(int3): " + int1.equals(int3)); // true
        System.out.println("int2.equals(int3): " + int2.equals(int3)); // true

        System.out.println("int1 has= " + System.identityHashCode(int1)); // 1854731462
        System.out.println("int2 has= " + System.identityHashCode(int2)); // 317574433
        System.out.println("int3 has= " + System.identityHashCode(int3)); // 885284298



    }


}
