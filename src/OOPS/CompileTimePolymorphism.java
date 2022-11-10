package OOPS;
class SStudent{
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(this.name);
    }

    public void displayInfo(int age) {
        System.out.println(this.age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(this.name+", "+this.age);
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        SStudent s1 = new SStudent();
        s1.name = "Pankaj Yadav";
        s1.age = 20;
        s1.displayInfo("Pankaj Yadav", 20);
    }
}
