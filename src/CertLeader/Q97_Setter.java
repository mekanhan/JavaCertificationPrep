package CertLeader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q97_Setter {
    private double length;
    private double height;
    private double area;

    public double getLength() {
        return length;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return area;
    }
    public void setLength(double length) {
        this.length = length;
        setArea();                          //must be here
    }
    public void setHeight(double height) {
        this.height = height;
//        setArea();                          //must be here
    }
    public void setArea() {
        area = length*height;
    }
    public static void main(String[] args) {
        Q97_Setter a= new Q97_Setter();
        a.setHeight(2);
        a.setLength(2);
//        a.setArea();                        //or this can be used
        System.out.println(a.getArea());    //or this can be used
        int b = (int) a.area;
        System.out.println(b);
    }


}
