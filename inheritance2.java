class vehicle{
    double price;
    double mileage;
    String color;

    void display()
    {
        System.out.println("Price: Rs."+ price);
        System.out.println("Mileage: " + mileage+ " L");
        System.out.println("Color : " + color);
    }
}

class car extends vehicle{
String ftype;
boolean sunroof;
String brand;
}

public class inheritance2 {
    public static void main(String []args){
        car car1 = new car();
        car1.brand = "Audi";
        car1.price = 3500000;
        car1.mileage= 18.3;
        car1.ftype = "Disel";
        car1.color = "red";
        car1.sunroof= true;

        car1.display();
    }
}
