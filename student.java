public class student {

    private String name;
    private int roll;

    student(String name , int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public static void main(String[] args){

        student obj = new student("Ankur", 53);

        System.out.println("Name: " + obj.getName());
        System.out.println("Roll: " + obj.getRoll());
    }
}