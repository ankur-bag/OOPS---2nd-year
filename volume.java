class volume {

    // Cube
    double volume(double side) {
        return side * side * side;
    }

    // Cuboid
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    // Cylinder
    double volume(double radius, double height) {
        return 3.14 * radius * radius * height;
    }

    public static void main(String[] args) {
        volume v = new volume();

        System.out.println("Volume of Cube: " + v.volume(4));
        System.out.println("Volume of Cuboid: " + v.volume(4, 5, 6));
        System.out.println("Volume of Cylinder: " + v.volume(3, 7));
    }
}