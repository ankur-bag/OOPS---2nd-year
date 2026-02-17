class Rectangle 
{
    	double length;
    	double breadth;
    	Rectangle(double a,double b) 
		{
    		System.out.println("Parameterized Constructor of Rectangle");
			length = a;
    		breadth = b;

    	}
		Rectangle()
		{
			System.out.println("Default Constructor of Rectangle");
			length=0;
			breadth=0;
		}
    	double area()
		{
    		return(length*breadth);
    	}

}

class Cuboid extends Rectangle 
{
    	double height;
    	Cuboid (double x,double y,double z)
		{
    		super(x,y);
			System.out.println("Parameterized Constructor of Cuboid");
			
    		height=z;
    	}
		Cuboid(Rectangle r, double a)
		{
			//super(r.length,r.breadth);
			System.out.println("2nd Constructor of Cuboid");
			this.length=r.length;
			this.breadth=r.breadth;
			height=a;
		}
    	double volume()
    	{
    		return (length*breadth*height);
    	}

}
class InherTest
{

    	public static void main(String[] args) 
	{
       		Rectangle r1 = new Rectangle(10,20);
       		//Cuboid c1 = new Cuboid(5,10,15);
			Cuboid c2 = new Cuboid(r1,30);
       		double area1 = r1.area();
       		//double volume1 = c1.volume();
			//double area2=c1.area();
       		System.out.println("Area ="+area1);
       		//System.out.println("Volume="+volume1);
			//System.out.println("Area ="+area2);
			System.out.println("Volume of c2="+c2.volume());
    }

}