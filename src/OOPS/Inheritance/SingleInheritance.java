package OOPS.Inheritance;
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(double h, double b) {
        System.out.println((b*h)/2);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(1, 5);
    }
}
