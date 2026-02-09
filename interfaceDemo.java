interface Car {
    void start();
}

class ElectricCar implements Car {
    public void start() {
        System.out.println("Electric car starts");
    }
}

class DieselCar implements Car {
    public void start() {
        System.out.println("Diesel car starts");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        Car xuv700 = new DieselCar();

        tesla.start();
        xuv700.start();
    }
}
