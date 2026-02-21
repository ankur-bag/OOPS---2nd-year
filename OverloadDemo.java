class OverloadDemo {

    OverloadDemo(int a) {
        System.out.println("Constructor with int: " + a);
    }

    OverloadDemo(double a) {
        System.out.println("Constructor with double: " + a);
    }

    void show(int a) {
        System.out.println("Method with int: " + a);
    }

    void show(double a) {
        System.out.println("Method with double: " + a);
    }

    public static void main(String[] args) {

        OverloadDemo obj1 = new OverloadDemo(10);     // int constructor
        OverloadDemo obj2 = new OverloadDemo(10.5);   // double constructor

        obj1.show(5);        // int method
        obj1.show(5.5);      // double method
    }
}