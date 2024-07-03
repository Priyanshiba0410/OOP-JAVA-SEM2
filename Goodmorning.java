class Morning implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Good morning");
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
			{

			}
	}
}
class Afternoon implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("Good afternoon");
				Thread.sleep(3000);
			}
			
		}
		catch(Exception e)
			{

			}
	}
}
 public class Goodmorning
 {
 	public static void main(String[] args) {
 		Morning m = new Morning();
 		Thread t1 = new Thread(m);
 		Afternoon a = new Afternoon();
 		Thread t2 = new Thread(a);
 		t1.start();
 		t2.start();
 	}
 }