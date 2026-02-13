//This code will not work in Java
class StaticVariable
{
	static int b=10;
	public static void main(String args[])
	{
		int x=5;
		int y=func(x);
		System.out.println("Value of y="+y);
		y=func(x);
		System.out.println("Value of y="+y);
	}
	public static int func(int a)
	{
		
		b++;
		return b;
	}
}