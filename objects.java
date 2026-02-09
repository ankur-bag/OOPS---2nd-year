public class objects {
    String  name;
    int roll;

    public void print()
    {
        System.out.println ("Name: " + name);
        System.out.println ("Roll no.: "+ roll);

    }
    
    public static void main(String[] args) {
        objects obj = new objects();
        obj.name = "Ankur Bag";
        obj.roll = 20;
         obj.print();
        obj.name="Sam";
        obj.roll= 15;
        obj.print();

    }
}


