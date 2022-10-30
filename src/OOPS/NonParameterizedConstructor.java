package OOPS;
// Runtime Polymorphism
class Shape{
    public void area() {
        System.out.println("Display of the shape");
    }
}

class Triangle extends Shape{
    public void area(double h, double b) {
        System.out.println((b*h)/2);
    }
}
class Circle extends Triangle{
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class NonParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Pankaj Yadav", 26);
        Student s2 = new Student(s1);
        System.out.println(s1.age);
        Circle c1 = new Circle();
        c1.area(6);
        c1.area(2,3);
        c1.area();

    }
}
