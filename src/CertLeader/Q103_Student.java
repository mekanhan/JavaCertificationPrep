package CertLeader;

import whiz.Methods_and_Encapsulation.Student;

public class Q103_Student {
    String name;
    public Q103_Student (String name){
        this.name = name;
    }

    public static void main(String[] args) {
        String [] myArray;
        Q103_Student [] students = new Q103_Student[3];
//        students [0] = new Q103_Student("Helli");
        students [1] = new Q103_Student("Richard");
        students [2] = new Q103_Student("Donald");
        for (Q103_Student s: students) {
            System.out.println("" + s.name);
        }
    }

}
