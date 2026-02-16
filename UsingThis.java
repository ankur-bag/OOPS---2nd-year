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
  Point great(Point obj)
    {
      if(obj.dist>=this.dist)
      return obj;
      else
      return this;
    }
}
class ThisTest
{
  public static void main(String args[])
  {
    Point obj1=new Point(5,10);
    Point obj2=new Point(2,3);
    Point obj3=obj1.great(obj2);
    System.out.println("x coordinate : "+obj3.x);
    System.out.println("y coordinate:"+obj3.y);
   }
}