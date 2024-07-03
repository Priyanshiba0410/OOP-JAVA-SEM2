import java.util.*;
public class Pallindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number:");
		int first_num=sc.nextInt();
		int temp=first_num;
		int sum=0;
		int rem=0;
		while(first_num!=0){
			rem=first_num%10;
			sum=(sum*10)+rem;
			first_num=first_num/10;
		}
		if(temp==sum){
			System.out.println("num is Pallindrome");
		}
		else{
			System.out.println("num is not Pallindrome");
		}
	}
}