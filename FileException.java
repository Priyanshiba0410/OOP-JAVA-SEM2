import java.io.*;
public class FileException
{
	public static void main(String[] args) 
	{
		String line;
		int read=0;
		int charread=0;
		try
		{
			
			FileReader fr = new FileReader("./abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				read++;
				charread+=line.length();
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