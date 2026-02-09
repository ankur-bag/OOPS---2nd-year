class student{
    private String  name;
    private int age;
    private int roll;


    public String getName(){
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
}

public class encapsulation {
    public static void main(String []args)
    {
        student obj = new student();
        obj.setName("Ankur");
        obj.setAge(21);
        obj.setRoll(53);
        System.out.println (obj.getName());
       System.out.println ( obj.getAge());
        System.out.println (obj.getRoll());
    }
}
