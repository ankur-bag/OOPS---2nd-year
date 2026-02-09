class parentClass{
    void display()
    {
        System.out.println("parent class method");
    }
}

class childClass extends parentClass{
    void show()
    {
        System.out.println ("child class method");
    }
}

public class inheritance{
    public static void main(String []args)
    {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}