import java.util.*;
public class Lab3_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks1:");
		int marks1=sc.nextInt();
		System.out.println("enter marks2:");
		int marks2=sc.nextInt();
		System.out.println("enter marks3:");
		int marks3=sc.nextInt();
		System.out.println("enter marks4:");
		int marks4=sc.nextInt();
		System.out.println("enter marks5:");
		int marks5=sc.nextInt();
	    double sum=(marks1+marks2+marks3+marks4+marks5)/5.0;
	    if(sum>=60){
	    	System.out.println("first division");
	    }
	    if(sum<=59 && sum>=50){
	    	System.out.println("second division");
	    }
	    if(sum<=49 && sum>=40){
	    	System.out.println("third division");
	    }
	    if(sum<=40){
	    	System.out.println("fail");
	    }

	}
}