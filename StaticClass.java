class StaticClass
{
   private static String str = "Hello RCCIIT!!";
	//int x=10;

   //Static class
   static class MyNestedClass{
	//non-static method
	public void disp() {

	   
	   System.out.println(str);
	   System.out.println(x); 
	}

   }
   public static void main(String args[])
   {
       
	StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
	obj.disp();
   }
}
