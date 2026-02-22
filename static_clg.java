class student{
    static String college = "RCCIIT";
    String name ;
    int roll;

    //constructor
   student (String name , int roll)
    {
        this.name = name;
        this.roll = roll;
        
    }

    static void newCllg(String college)
    {
        student.college = college; //no this. required
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College: " + college);
        System.out.println();
    }

}


public class static_clg {
    public static void main(String[] args) {
        student obj1 = new student("Ankur", 53);
        student obj2 = new student("sam", 33);

        obj1.display();
        obj2.display();

        student.newCllg("IIT");

         obj1.display();
        obj2.display();
        
    }
}
