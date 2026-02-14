class demoStatic
{
	static int a=5;
	static int b=10;
	static void display(int c)
	{
		System.out.println(a+" "+b+" "+c);
		//System.out.println("b="+b);
		//System.out.println("c="+c);
	}
	static
	{
		System.out.println("Static block Executed");
		b=a*b*10;
	}
	public static void main(String args[])
	{
		display(20);
	}
}