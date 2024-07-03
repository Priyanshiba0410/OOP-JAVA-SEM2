import java.util.Scanner;
public class Secondhalf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String str=sc.next();
		int n=str.length();
		int half=n/2;
		System.out.println("half of String is:"+half);
		for(int i=half;i<n;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}