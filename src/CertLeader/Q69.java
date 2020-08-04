package CertLeader;

public class Q69 {
     String name;
     int age;
     int salary;

    public Q69() {
    }

    public Q69(String name, int age ){
        setName(name);
        setAge(age);
        setSalary(2000);
    }
    public Q69(String name, int age, int salary) {
        this(name, age);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println(name + " : " + age + " : " + salary);
    }
    public static void main(String[] args) {
        Q69 e1 = new Q69();
        Q69 e2 = new Q69("jack", 50);
        Q69 e3 = new Q69("Chloe", 40, 5000);
        e2.printDetails();
        e3.printDetails();
    }
}
