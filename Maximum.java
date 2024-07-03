import java.util.*;
public class Maximum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("a is Maximum");
			}
		}
		else if(b>c){
			System.out.println("b is Maximum");
		}
	else 
		{
			System.out.println("c is Maximum");
		}
	}
}