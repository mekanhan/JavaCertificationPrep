package whiz.Methods_and_Encapsulation;

public class Student {
    public int rollno;      //could be private as well
    public String name;     //could be private as well

    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class EncapsulationDemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Mike");
        s1.setRollno(2);

        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
    }
}
