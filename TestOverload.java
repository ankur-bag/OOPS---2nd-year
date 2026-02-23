class Demo {
    // Constructor Overloading
    Demo() {
        System.out.println("No-arg constructor");
    }

    Demo(int x) {
        System.out.println("Integer constructor: " + x);
    }

    Demo(double x) {
        System.out.println("Double constructor: " + x);
    }

    // Method Overloading
    void show(int a) {
        System.out.println("Integer method: " + a);
    }

    void show(double a) {
        System.out.println("Double method: " + a);
    }
}

public class TestOverload {
    public static void main(String[] args) {
        Demo d1 = new Demo();      // Calls no-arg constructor
        Demo d2 = new Demo(10);    // Calls int constructor
        Demo d3 = new Demo(10.5);  // Calls double constructor

        d1.show(5);     // Calls int method
        d1.show(5.5);   // Calls double method
    }
}