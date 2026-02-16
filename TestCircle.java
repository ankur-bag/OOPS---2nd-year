class Circle
{
	double x,y;
	double radius;
	Circle()
	{
		x=y=radius=0.0;
	}
	Circle(double a, double b, double r)
	{
		x=a;
		y=b;
		radius=r;
	}
	Circle(Circle obj)
	{
		x=obj.x;
		y=obj.y;
		radius=obj.radius;
	}
	void show()
	{
		System.out.println("Centre of the Circle is:("+this.x+","+this.y+")");
		System.out.println("Radius of the Circle is:"+this.radius);
		System.out.println("Area of the Circle is:"+area());
		System.out.println("Circumference of the Circle is:"+circumference());
	}
	double area()
	{
		double ar=Math.PI*radius*radius;
		return ar;
	}
	double circumference()
	{
		double cir=2*Math.PI*radius;
		return cir;
	}
}
	
class TestCircle
{
	public static void main(String args[])
	{
		Circle c1=new Circle(4,8,6.5);
		c1.show();
		Circle c2=new Circle(6,3,5.2);
		c2.show();
		Circle c3=new Circle(c2);
		c3.show();
	}
}