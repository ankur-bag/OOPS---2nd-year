class Test
{
	static int x=10;
	void display()
	{
		System.out.println(x);
	}
	static void callDisp()
	{
		Test obj =new Test();		
		obj.display();
	}
	public static void main(String args[])
	{
		
		Test.callDisp();
	}
}
