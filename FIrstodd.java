import java.util.scanner
public class Firstodd{
	public static void main(String[] args) {
		System.out.println("enter num");
		scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n*2;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
}