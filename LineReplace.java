import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class LineReplace{
	public static void main(String[] args) {
		try{
			File file = new File("a.txt");
			Scanner sc = new Scanner(file);
			FileWriter writer = new FileWriter(new File("b.txt"));
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				System.out.println(line);
				line = line.replace("java","Nency");
				writer.append(line);
			}
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}