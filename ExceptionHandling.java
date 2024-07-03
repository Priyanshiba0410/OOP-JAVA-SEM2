public class ExceptionHandling
{
	public static void main(String[] args) 
	{    
		try{
		int x= Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=x*y;
		for(int i=0;i<=4;i++)
		{
			System.out.println("z-"+z);
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println("this is number format exception:");
	}
	catch(ArithmeticException e)
	{
		System.out.println("this is an Arithmetic Exception:");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("this is an ArrayIndex Out Of Bounds Exception:");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}