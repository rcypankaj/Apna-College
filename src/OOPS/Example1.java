package OOPS;
class Student {
    public String name;
    public int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //NonParameterizedConstructor
    Student(){
        System.out.println("Constructor Called");
    }

    // ParameterizedConstructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        System.out.println(name);
        System.out.println(age);
    }

    // compile time Polymorphism
    public void studentInfo(String name) {
        System.out.println(name);
    }

    public void studentInfo(int age) {
        System.out.println(age);
    }

    public void studentInfo(String name, int age) {
        System.out.println(name + "" + age);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pankaj Yadav";
        s1. age = 26;
        s1.printInfo();

    }
}
