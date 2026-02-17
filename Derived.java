class Base

{
	public String s = "Super Class ";
	public Base()
	{
		System.out.println("Base Class Constructor");
	}

}
public class Derived extends Base
{
	public Derived()
	{
		//super();

		System.out.println("Derived Class Constructor");
	}
	public static void main(String[] args)
	{
		Derived obj = new Derived();
		System.out.println(obj.s);
	}

}