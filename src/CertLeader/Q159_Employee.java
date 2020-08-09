package CertLeader;

public class Q159_Employee {
    public Q159_Employee (){

    }
    private  String name;
    private int age;
    private int salary;

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
    public Q159_Employee (String name, int age){
        setName (name);
        setAge (age);
        setSalary (2000);
    }
    public Q159_Employee (String name, int age, int salary){
        setSalary(salary);
        this.name=name;
        this.age=age;
    }
    public void printDetails (){
        System.out.println(name + age + salary);
    }

}
