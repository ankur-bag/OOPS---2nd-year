class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

class Student {

    public void calculateTotal() {
        Calculator calc = new Calculator();   // Creating another object
        int result = calc.add(40, 50);        // Sending message
        System.out.println("Total Marks: " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.calculateTotal();   // Message passing
    }
}