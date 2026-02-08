public class MyBox {

    double length;
    double breadth;
    double height;
    static int noOfBoxes = 0;   // should be static to count total objects

    // Default Constructor
    public MyBox() {
        System.out.println("Default Constructor Called");
        length = 0;
        breadth = 0;
        height = 0;
        noOfBoxes++;
    }

    // Parameterized Constructor
    public MyBox(double l, double b, double h) {
        System.out.println("Parameterized Constructor Called");
        length = l;
        breadth = b;
        height = h;
        noOfBoxes++;
    }

    // Copy Constructor
    public MyBox(MyBox box) {
        System.out.println("Copy Constructor Called");
        this.length = box.length;
        this.breadth = box.breadth;
        this.height = box.height;
        noOfBoxes++;
    }

    // Surface Area
    double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    // Volume
    double volume() {
        return length * breadth * height;
    }

    // Return greater volume box
    MyBox greaterMyBox(MyBox other) {
        if (this.volume() > other.volume()) {
            return this;
        } else {
            return other;
        }
    }

    // Display method
    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
        System.out.println("Total Boxes Created = " + noOfBoxes);
    }
}
