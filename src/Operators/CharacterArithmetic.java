package Operators;

public class CharacterArithmetic {

    public static void main(String[] args) {
        // char 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA= " + myCharA);
        System.out.println("myCharA is Letter= " + Character.isLetter(myCharA));
        System.out.println("myCharA is Letter= " + Character.isDigit(myCharA));

        System.out.println("myCharNum= " + myCharNum);
        System.out.println("myCharNum is Letter= " + Character.isLetter(myCharNum));
        System.out.println("myCharNum is Letter= " + Character.isDigit(myCharNum));

        // exam examples
        char letter = 65; //A
        int myInt = letter + 3;
        char myNewLetter = (char)myInt;
        System.out.println("letters= " + letter);
        System.out.println("myInt= " + myNewLetter);

        char myChar = 65; // A
        char newChar = (char)(myChar + 1);
        boolean b = newChar == 'B';  // true
        boolean c = (++newChar == 'C'); // true
        System.out.println("myChar= " + myChar);
        System.out.println("newChar= " + newChar);
        System.out.println("b= " + b);
        System.out.println("c= " + c);


    }
}
