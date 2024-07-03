import java.util.Scanner;
public class FinallyKeyward
{
	public static void main(String[] args){
		double c=1;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of a");
			double a = sc.nextDouble();
			System.out.println("enter the value of b:");
			double b = sc.nextDouble();
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("ans="+c);
		}
		}
	}
