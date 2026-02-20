class StaticBlockDemo {

    static int number;

    static {
        number = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Value of number: " + number);
    }
}