class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class dynamic_binding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Bark
    }
}
