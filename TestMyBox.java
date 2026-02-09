import java.util.*;

public class TestMyBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default constructor
        MyBox box1 = new MyBox();

        // Parameterized constructor
        System.out.println("Enter length breadth height:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        MyBox box2 = new MyBox(l, b, h);

        // Copy constructor
        MyBox box3 = new MyBox(box2);

        // Display
        box2.display();

        // Surface Area & Volume
        System.out.println("Surface Area = " + box2.surfaceArea());
        System.out.println("Volume = " + box2.volume());

        // Greater box
        MyBox greater = box2.greaterMyBox(box3);
        System.out.println("Greater Box Volume = " + greater.volume());
    }
}
