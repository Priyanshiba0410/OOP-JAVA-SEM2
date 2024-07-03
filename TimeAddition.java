import java.util.Scanner;
class Time
{
	int hour;
	int min;
	int hours;
	int minutes;
	Time()
	{
		this.hour=hours;
		this.min=minutes;

	}
	Time(int hour,int min)
	{  
		this.hour=hour;
		this.min=min;
	}
	void add(Time t)
	{
		int h = this.hour + t.hour;
		int m = this.min + t.min;
		if(min>=60)
		{
			min=60+min;
			hour++;
		}
		System.out.println("add time="+h+"hour"+m+"min");

	}
}

public class TimeAddition{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter time:");
		int hours=sc.nextInt();
		time t3=new Time();
		System.out.println("enter minutes");
		int minutes=sc.nextInt();
		time t4=new Time();
		time t1=new Time(hours,minutes);
		time t2=new Time(hours,minutes);
		t1.add(t2);
	}
}