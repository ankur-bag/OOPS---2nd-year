class Rectangle
{
	double length;
	double breadth;
	Rectangle(double a,double b)
	{
		length=a;
		breadth=b;
	}
	Rectangle(Rectangle rect)
	{
		length=rect.length;
		breadth=rect.breadth;
	}
	double area()
	{
	return(length*breadth);
	}
}
class cuboid extends Rectangle
{
	double height;
	cuboid(double x,double y,double z)
	{
		super(x,y);
		height=z;
	}
	cuboid(Rectangle r,double h)
	{
		super(r);
		height=h;	
	}
	double volume()
	{
		return(length*breadth*height);
	}
}
class InherMod
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(10,20);
		cuboid c1=new cuboid(5,10,15);
		cuboid c2=new cuboid(r1,30);
		System.out.println("Area="+r1.area());
		System.out.println("Volume="+c1.volume());
		System.out.println("Volume="+c2.volume());
	}
}