import java.util.*;
public class ConsonantsVowels
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.next();    
		int vCount = 0, cCount =0;
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) 
        {    
            	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            	{ 
            	   vCount++; 
            	}
	 			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
	 			{      
	 				cCount++;
	 			}
}

		System.out.println("number of vowels" +vCount);
		System.out.println("numberof Consonants" +cCount);
}
}