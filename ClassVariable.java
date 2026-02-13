class ClassVariable
{
	int x;
	static int y;
	public void myInit(int a,int b)
	{
		x=a;
		y=b;
	}
	public void myIncrement()
	{
		x++;
		y++;
	}
	public void display()
	{
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);
	}~
}
class TestClassVariable
{
	public static void main(String args[])
	{
		ClassVariable obj1=new ClassVariable();
		ClassVariable obj2=new ClassVariable();
		obj1.myInit(5,10);
		System.out.println("Values for object 1:");
		obj1.display();
		obj2.myInit(8,10);
		System.out.println("Values for object 2:");
		obj2.display();
		obj1.myIncrement();
		System.out.println("Values for object 1:");
		obj1.display();
		System.out.println("Values for object 2:");
		obj2.display();
	}     
}