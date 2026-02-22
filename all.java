class Animal {
    private String name;   // Encapsulation

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {   // Inheritance
    @Override
    public void sound() {    // Polymorphism (Overriding)
        System.out.println("Dog barks");
    }
}

public class all {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Polymorphism
        obj.setName("Tommy");
        obj.sound();
    }
}