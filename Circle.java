class Circle
{
	double x,y;
	double radius;
	Circle()
	{
		x=y=radius=0.0;
	}
	Circle(double x, double y, double r)
	{
		this.x=x;
		this.y=y;
		radius=r;
	}
	Circle(Circle obj)
	{
		x=obj.x;
		y=obj.y;
		radius=obj.radius;
		System.out.println("Copy constructor called");
	}
	void show()
	{
		System.out.println("Centre of the Circle is:("+x+","+y+")");
		System.out.println("Radius of the Circle is:"+radius);
		System.out.println("Area of the Circle is:"+this.area());
		System.out.println("Circumference of the Circle is:"+this.circumference());
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
	Circle compare(Circle obj1,Circle obj2)
	{
		if(obj1.radius>obj2.radius)
		{
			System.out.println("Returning Obj1");
			return obj1;
		}
		else
		{
			System.out.println("Returning Obj2");
			return obj2;
		}
	}
	Circle compare(Circle obj1)
	{
		if(obj1.radius>this.radius)
		{
			System.out.println("Returning Obj1");
			return obj1;
		}
		else
		{
			System.out.println("Returning this");
			return this;
		}
	}
	double returnRadius()
	{
		return radius;
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
		Circle c3=new Circle();
		c3=c2.compare(c1);
		//c3=Circle.compare(c1,c2);
		c3.show();
		Circle c4=new Circle(c2);
		c4.show();
		System.out.println("The circle with greater area has radius:"+c3.returnRadius());
	}
}