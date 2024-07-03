import java.lang.Thread;
class Even extends Thread{
	public void run(){
		try
		{
			for(int i=0;i<20;i++)
			{
				if(i%2==0)
				{
					System.out.println("enter number"+i);
				}
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{

		}
	}
}
class Odd extends Thread
{
	public void run(){
		try{

				for(int i=0;i<20;i++)
				{
					if(i%2!=0)
					{
						System.out.println("enter number"+i);
					}
					Thread.sleep(500);
				}
			}
			catch(Exception e){

				}
			}
		}
public class Oddeven
{
	public static void main(String[] args) {
		Even e=new Even();
		Odd o = new Odd();
		e.start();
		o.start();
	}
}