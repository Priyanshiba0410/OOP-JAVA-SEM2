import java.io.*;
import java.util.Scanner;
public class WordReplace
{
	public static void main(String[] args) 
	{
		String line;
		int read=0;
		int charread=0;
		try
		{
			Scanner sc=new Scanner(System.in);
			String word1 = sc.next();
			String word2 = sc.next();
			FileReader fr = new FileReader("./abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				read++;
				charread+=line.length();
				String[] w = line.split("");
				word+=w.length;
				for(int i=0;i<w.length;i++)
				{
					if(word1.equals(W[i]))
					{
						w[i] = word1[2];
					}
				}
				}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		System.out.println(read);
		System.out.println(charread);
	}
	
}