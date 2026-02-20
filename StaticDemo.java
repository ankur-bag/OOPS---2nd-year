class Student {
    static String college = "RCCIIT";   // static variable
    String name;

    Student(String name) {
        this.name = name;
    }

    static void changeCollege(String newCollege) {  // static method
        college = newCollege;
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ankur");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();

        Student.changeCollege("Tech University");

        s1.display();
        s2.display();
    }
}