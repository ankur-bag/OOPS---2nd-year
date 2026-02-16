class Point 
{
   float x;
   float y;
   float dist;
   Point(float x,float y)
   {
     this.x=x;
     this.y=y;
     dist=(float)Math.sqrt(x*x+y*y);
    }
  static Point great(Point objA, Point objB)
    {
      if(objA.dist>=objB.dist)
      return objA;
      else
      return objB;
    }
}
class ThisTest
{
  public static void main(String args[])
  {
    Point obj1=new Point(5,10);
    Point obj2=new Point(2,3);
    Point obj3=Point.great(obj1,obj2);
    System.out.println("x coordinate : "+obj3.x);
    System.out.println("y coordinate:"+obj3.y);
   }
}