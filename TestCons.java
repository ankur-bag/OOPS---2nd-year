class Point
{
	int x;
	int y;
	Point()
	{
		x=0;
		y=0;
	}
	Point(int a,int b)
	{
		x=a;
		y=b;
	}
	Point(Point p)
	{
		System.out.println("Copy constructor called!");		
		this.x=p.x;
		this.y=p.y;
	}
	double distance()
	{
		double dist=Math.sqrt(x*x+y*y);
		return dist;
	}
	Point greater(Point a)
	{
		System.out.println("Hello");		
		if(this.distance()>a.distance())
		{
			return this;
		}
		else
			return a;
	}
}
class TestPoint
{
	public static void main(String args[])
	{
		Point P1=new Point(5,7);
		Point P2=new Point(10,12);
		System.out.println("The distance of P1="+P1.distance());
		System.out.println("The distance of P2="+P2.distance());
		Point g=P1.greater(P2);
		Point P3=new Point(P1);
		System.out.println("The Point("+g.x+","+g.y+") is having the distance:"+g.distance());



	}
}

