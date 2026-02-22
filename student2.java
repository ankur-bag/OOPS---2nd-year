public class student2 {

    private String name;
    private int roll;

    student2(String name , int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public void setName(String name){
        this.name = name; 
        
    }
    public void setRoll(int roll){
        this.roll = roll;
        
    }

    public static void main(String[] args){

        student2 obj = new student2("Ankur", 52);
        
        
        
        System.out.println("name : "+ obj.getName());
        System.out.println("roll : "+ obj.getRoll());

        obj.setName("Sam");
        obj.setRoll(33);

         System.out.println("name : "+ obj.getName());
        System.out.println("roll : "+ obj.getRoll());
    }
}