class RCCIIT
{
	public static void main(String args[])
	{
		
		RCCIIT obj=new RCCIIT();
		int leng=obj.func("Hello RCCIIT");
		System.out.println("Length of the string="+leng);
	}
	public int func(String str)
	{
		int l=str.length();
		return l;
	}	
}
