import java.io.BufferedReader;
import java.io.FileReader;
class student {
	String name;
	int age;
	student(String n,int a){
		this.name = n;
		this.age = a;
	}
	public String toString()
	{
		return name+" "+age;		
	}

}
public class BufferedWriter
{
	public static void main(String[] args) {
		try{

			BufferedReader br = new BufferedReader(new FileReader("a.txt"));
			String line;
			while((line = br.readLine()) != null)
			{
				String arr[] = line.split(" ");
				String name = arr[0];
				int age = Integer.parseInt(arr[1]);
				student s1 = new student(name,age);
				System.out.println(s1);
			}
		}
		catch(Exception e){
			System.out.println(e);

		}
		
	}
}