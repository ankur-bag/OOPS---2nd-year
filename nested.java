class Outer
{
	static int outer_x=10;
	void test()
	{
		Inner inner=new Inner();
		inner.display();
		inner.showy();
		//System.out.println(y);
	}
	class Inner
	{
		int y=20;
		void display()
		{
			//Outer obj=new Outer();
			System.out.println("Value of outer_x:"+outer_x);
		}
		void showy()
		{

			System.out.println("Value of y:"+y);
		}
	}
}
class InnerDemo
{
	public static void main(String args[])
	{
		Outer outer=new Outer();
		outer.test();
		System.out.println("Value of outer_x:"+outer.outer_x);
Outer.Inner obj1=outer.new Inner(); obj1.showy();   // When Inner class is non-static
		//Outer.Inner obj1=new Outer.Inner(); 
		//obj1.showy();  // When Inner class is static
	}
}
