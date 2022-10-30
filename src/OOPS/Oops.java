package OOPS;
class Pen {
    String color;

    public void printColor() {
        System.out.println(this.color);
    }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";

        Pen pen2 = new Pen();
        pen2.color = "Black";

        Pen pen3 = new Pen();
        pen3.color = "Green";

        pen1.printColor();
        pen2.printColor();
        pen3.printColor();
    }
}
