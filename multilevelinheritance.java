class A {
    void methodA(){
        System.out.println("Method od A class");
    }
}
class B extends A{
void methodB(){
        System.out.println("Method od B class");
    }
}
class C extends B{
void methodC(){
        System.out.println("Method od C class");
    }
}

public class multilevelinheritance {
    public static void main (String []args)
    {
        C obj = new C ();
        obj.methodA();
        obj.methodB();
        obj.methodC();
       
    }
}
